package HashMap;
import java.util.*;

public class Iteration {

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 125);
        map.put("Indonesia", 6);
        map.put("China", 150);
        map.put("Russia", 45);
        map.put("US", 50);
        map.put("Nepal", 5);

        // now we create a set to store the keys

        Set<String> key = map.keySet();

        // now use a loop to get the value of each key
        // foreach loop

        for (String s : key) {
            
            System.out.println("key = "+ s +" value = "+map.get(s));
        }
    }
    
}
