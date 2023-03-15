package HashMap;
import java.util.*;

public class Treemap {
    
public static void main(String[] args) {

    TreeMap<String, Integer> tmap = new TreeMap<>();

    tmap.put("India", 100);
    tmap.put("China", 125);
    tmap.put("PPak", 2);
    tmap.put("US", 50);
    tmap.put("UK", 55);

    System.out.println(tmap);
}
}
