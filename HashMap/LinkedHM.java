package HashMap;
import java.util.*;

public class LinkedHM {
    
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Kolkata");
        lhs.add("Chennai");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Noida");
        ts.add("Andaman");
        ts.add("Mumbai");
        ts.add("Delhi");

        System.out.println(ts);


    }
}
