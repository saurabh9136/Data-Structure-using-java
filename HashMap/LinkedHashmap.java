package HashMap;
import java.util.*;


public class LinkedHashmap {

    public static void main(String[] args) {  
        // byusing this ds the data will be store in insertion order 
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 125);
        lhm.put("Pak", 2);
        lhm.put("US", 50);
        lhm.put("UK", 55);

        System.out.println(lhm);
    }
    
}
