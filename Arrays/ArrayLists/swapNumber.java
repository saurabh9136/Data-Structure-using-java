package ArrayLists;
import java.util.*;

public class swapNumber {

    public static void swap(ArrayList<Integer> array, int indx1, int indx2){

        //swapping
        int temp = array.get(indx1);
        // now we are setting the value on index so we use set operation
        array.set(indx1, array.get(indx2));
        array.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        // swap 2 number

       int indx1 = 1, indx2 = 3;
       System.out.println(array);
       swap(array, indx1, indx2);
       System.out.println(array);
        
    }    
}
