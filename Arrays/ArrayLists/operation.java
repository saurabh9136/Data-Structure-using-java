package ArrayLists;
import java.util.*;

public class operation {

    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<>();
        // writing a code a data into array
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        // adding element at particular index
        array.add(1,9);
        System.out.println(array);
        // tc for each operation is O(1)

        // writing a code to get the index value in array

        int element = array.get(2);
        System.out.println(element);
        
        
         // writng a code to remove any element from array using index number
        
         array.remove(2);
        System.out.println(array);
         // tc for each operation is O(n)

         // set element in particular index

         array.set(2, 10);
         System.out.println(array);
          // tc for each operation is O(n)

          // to know if element contains in array or not
          System.out.println(array.contains(1));
          System.out.println(array.contains(6));
          // tc for each operation is O(n)
    }   
}
