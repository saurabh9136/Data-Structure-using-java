package DSA_algorithms.solveQuestions;

public class trappedwater {

    //Given n non-negative integers representing an elevation map where the width of 
    //each bar is 1, compute how much water it can trap after raining.

    public static int Trapped_water(int nums[]){

        int n = nums.length; // to code smoothly

        int left_MAX[] = new int[n]; // make new array for calculate the max value on left

        left_MAX[0] = nums[0]; // the value of both idex are same

        for(int i=1; i<nums.length; i++){ // loop to calcukate 

             left_MAX[i] = Math.max(nums[i], left_MAX[i-1]); // max function
        }

        int Right_MAX[] = new int[n]; // same as above

        Right_MAX[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){

             Right_MAX[i] = Math.max(nums[i], Right_MAX[i+1]);
        }

        int trapedWat = 0;

        for(int i=0; i<n; i++){

            int water = Math.min(left_MAX[i], Right_MAX[i]);

            trapedWat += water - nums[i];

        }

        return trapedWat;

    }

    public static void main(String[] args) {
        
        int nums[] = {4, 2, 0, 3, 2, 5};

        System.out.println(Trapped_water(nums));
    }
    
}
