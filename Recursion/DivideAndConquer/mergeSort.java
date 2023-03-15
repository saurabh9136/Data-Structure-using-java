package Recursion.DivideAndConquer;

public class mergeSort {

    public static void printArr(int arr[]){

       
        for(int i =0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   public static void mergeSortArr(int arr[],int si,int ei){

    // base case 
    if(si >= ei){
        return;
    }
    // first calculate the mid
    int mid = si+(ei-si)/2;//also(si-ei)/2
    //now sort the arrays in part
    //first part i to mid
    mergeSortArr(arr, si, mid);
    //second part from mid+1 to ei
    mergeSortArr(arr, mid+1, ei);
    //now call another function which merge the sorted array
    merge(arr,si,mid,ei);

   }

   public static void merge(int arr[],int si,int mid, int ei){

    //now create a temporary array which stores the sorted array
    int temp[] = new int[ ei-si+1];//it calculate the size of original array
    int i = si; // iterator for first part
    int j = mid+1;//iteratoe of second part
    int k = 0; //it works as index 

    //now compare the 1st and 2nd part and store the minimum value
    while(i <= mid && j  <= ei){

        if(arr[i] < arr[j]){

            temp[k] = arr[i];
            i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    // now check for first part
    while(i <= mid){
       
        temp[k++] = arr[i++];

   }
   while(j<=ei){
       
    temp[k++] = arr[j++];
}

// now all values are stored into temp array in sorted order noe copy it into original'
   for(k=0,i=si; k < temp.length;k++,i++){
    arr[i] = temp[k];
   }
}
    public static void main(String[] args) {
        
        int arr[] = {6, 3, 9, 8, 2, 5,1,4,7}; 
       mergeSortArr(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
