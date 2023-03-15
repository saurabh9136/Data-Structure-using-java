package Recursion.DivideAndConquer;

public class quickSort {

    public static void printArr(int arr[]){

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSortArr(int arr[], int si, int ei){
       
        //base case
        if(si >= ei){
            return;
        }

        // create a pivot index which calulate the pivot
        int pivIndx = partition(arr,si,ei);
        // now divide array in two parts using the recursion
        quickSortArr(arr, si, pivIndx-1);//we need to divide it before the pivot indx that why -1
        //vice versa for right part index by +1
        quickSortArr(arr, pivIndx+1, ei);

    }

    public static int partition(int arr[],int si,int ei){

        //1 st get the value of pivot
        int pivot = arr[ei]; //let ei as a pivot
        // now to traverse in array get a -1 index value
        int i = si-1;
// in loop let j=si because the value of index change most of the time so dont take as 0
        for(int j=si; j<ei; j++){

            if(arr[j] < pivot){
// if the value is less then, 1st increment the value and of index and swap
              
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now place the pivot at right position
        i++;
        int temp = pivot;
//we use arr[ei] insted of pivot because pivot is variable not an array       
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
  
        public static void main(String[] args) {
        
        int arr[] = {2,4,5,3,1};
        quickSortArr(arr, 0, arr.length-1);
        printArr(arr);

    }
    
}
