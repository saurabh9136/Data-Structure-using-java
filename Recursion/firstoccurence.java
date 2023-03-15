package Recursion;

public class firstoccurence {

    public static int firstOccur(int arr[], int key, int indx){

        
        if(indx == arr.length){

            return -1;
        }
        if(arr[indx] == key){

            return indx;
        }

        return firstOccur(arr, key, indx+1);
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 3,5,2, 5, 4, 8, 8, 4, 3, 8,8};

        System.out.println(firstOccur(arr, 8, 0));
    }
    
}
