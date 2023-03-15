package ArrayLists;
import java.util.*;

public class reversePrint {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        // print in reverse order
        for(int i=array.size()-1; i>=0; i--){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }    
}
