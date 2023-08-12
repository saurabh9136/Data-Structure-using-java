package DSA_algorithms;

public class TrappedRainWater {

    public static int Trapped_Rainwater(int height[]){

        int n = height.length;

        // calculate the max of left

        int MaxLeft[] = new int[n];
        // we know the value of height[0] or leftMax[0] is same
          MaxLeft[0] = height[0] ;
        // now we initalie i as 1 because 0 is already same
        for(int i=1; i<n; i++){

            MaxLeft[i] = Math.max(height[i], MaxLeft[i-1]);
        }

        // calculate the max of Right

        int MaxRight[] = new int[n];

        // now we go frm n-1 to 0
        // we know the value of height[n-1] or leftMax[n-1] is same
        MaxRight[n-1] =  height[n-1]  ;
        // now we initalie i as 1 because n-1 is already same
        for(int i=n-2; i>=0; i--){

            MaxRight[i] = Math.max(height[i], MaxRight[i+1]);
        }
        // user loop to calculate the water

        int trappedWater = 0;

        for(int i=0; i<n; i++){

            // calculate minimum value from both

            int water = Math.min(MaxLeft[i], MaxRight[i] );

            // now calculate the trapped water by using below formula

            trappedWater += water - height[i];
        }

            return trappedWater;
    }

    public static void main(String[] args) {
        
        int height[] = {4, 2, 0, 3, 2, 5};

        System.out.println(Trapped_Rainwater(height));
    }
    
}
