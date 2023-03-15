package ArrayLists;
import java.util.*;

public class sizeofArray {
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        // to know the size of array we use size function

        System.out.println(array.size());

        // print the value of array using for loop

        for(int i=0; i<array.size(); i++){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();

    }    
}
