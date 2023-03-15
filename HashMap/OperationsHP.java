package HashMap;
import java.util.*;

public class OperationsHP {

    public static void main(String[] args) {
        
        //syntax 
        HashMap<String, Integer> map = new HashMap<>();
        
        // to add 
        map.put("India", 150);
        map.put("china", 175);
        map.put("us", 50);

        // to get the valu
        int val = map.get("India"); //it returns object value
        System.out.println(val);

        //containsKey
        map.containsKey("India"); //it return boolean answer

        // printing hashMap
        System.out.println(map);

        // remove functiom
        map.remove("us"); //it returns the value of OBJ

        //isEmpty
        System.out.println(map.isEmpty());

        // clear - it will delete all maps 
        map.clear();
        System.out.println(map);
        
        // size
        System.out.println(map.size());
    }
    
}
