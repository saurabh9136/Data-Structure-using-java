package HashMap;
import java.util.*;

public class FindItinerary {

    public static String getStart( HashMap<String, String> tickets) {

        HashMap<String, String> revMap = new HashMap<>();

        // put the reverse value
        for( String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key); //1st store value then key so it will be in reverse order
        }

        //now get starting point
        for( String key : tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
    
    public static void main(String[] args) {
        
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // starting point
        String start = getStart(tickets);

        // now print the rout 1st print start
        System.out.print(start);

        // step 2 update  the start value 
      /*  for( String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start)); //print value
            start = tickets.get(start); //update the value
        } */

        System.out.println();
    }
}
