package Recursion.DivideAndConquer;

public class binarySearchArray {

    public static int binarySearch(int arr[], int tar, int si, int ei ){
        
        int mid = si + (ei-si)/2;
        if(si > ei){
            return -1;
        }
      // check at mid value
      if(arr[mid] == tar){
          return mid;
      }
      //the check from left to mid
      //case 1: check on line 1
      if(arr[si] <= arr[mid]){

        // case a : check to left
         if(arr[si] <= tar && tar <= arr[mid]){

            return binarySearch(arr, tar, si, mid-1);
         }else{

            // case b: check from mid to right
            return binarySearch(arr, tar, mid+1, ei);
         }
      }
 
      // case 2: CHECK at second line
      else{

        if(arr[mid] <= tar && tar <= arr[ei]){
            //case c: check at secod line from mid to end
            return binarySearch(arr, tar, mid+1, ei);
        }
        else{

            // case d: check from starting index to mid
            return binarySearch(arr, tar, si, mid-1);
        }


      }



    }
    public static void main(String[] args) {
        

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 10 ;

        int index = binarySearch(arr, tar, 0, arr.length-1);
        System.out.println(index);
    }
    
}
