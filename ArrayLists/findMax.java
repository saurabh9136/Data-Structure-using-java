package ArrayLists;
import java.util.*;

public class findMax {
    public static void main(String[] args) {
        
      int max = Integer.MIN_VALUE;
      ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(9);
        array.add(8);
        array.add(7);
        array.add(5);

        for(int i=0; i<array.size(); i++){
            // if(array.get(i) > max){
            //    max = array.get(i);
            // }
            // also
            max = Math.max(max, array.get(i));
        }
      System.out.println(max);
    }    
}
