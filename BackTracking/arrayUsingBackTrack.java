package BackTracking;

public class arrayUsingBackTrack {

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int value){

        if(i == arr.length){

            printArray(arr);
            return;
        }

        // recursion
        arr[i] = value;
        changeArr(arr, i+1, value+1);
        // now use backTracking to change value inside the array
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args){

        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);
    }
    
}
