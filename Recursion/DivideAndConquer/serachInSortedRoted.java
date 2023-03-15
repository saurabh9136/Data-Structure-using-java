package Recursion.DivideAndConquer;
public class serachInSortedRoted {

    public static int search(int arr[], int target, int si, int ei){
        // base case
        if(si > ei){
            return -1;
        }

        // kamm
        int mid = si+(ei-si)/2;
        
            // check at mid value
            if(arr[mid] == target){
                return mid;
            }

             //l1 when mid is lying on left part
            if(arr[si] <= arr[mid]){

            //case 1 left side : checking on left side
            if(arr[si] <= target &&  target <=arr[mid]){
                // a : if tar lying on left side of mid point
                return search(arr, target, si, mid-1);
            }

             else{
             // B: if tar laying on right side of mid
             return search(arr, target, mid+1, ei);                     
            }

        }

        else{

        // l2 if mid is lying in right part
        // case 2 : if tar is > mid
        if(arr[mid] <= target &&  target <=  arr[ei]){
         return search(arr, target, mid+1, ei);

        }
        
        else{
            // case d when tar occurs before the mid part
            return search(arr, target, si, mid-1);
        }

    }                
}

    public static void main(String[] args) {
        
        int arr[] = {6, 5, 4, 3, 0, 1, 2};
        int target = 4;
        int index = search(arr, target, 0, arr.length-1);
        System.out.println(index);

    }
    
}
