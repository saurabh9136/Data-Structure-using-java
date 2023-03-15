package Recursion;

public class printOccurance {

    public static void printOccur(int arr[], int key,int index){

        if(index == arr.length){

            return;
        }

        // kaam 
        if(arr[index] == key){

            System.out.print(index+" "); 
        }

        printOccur(arr, key, index+1);
        

    }
    public static void main(String[] args) {
        
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        printOccur(arr, key, 0);
    }
}
