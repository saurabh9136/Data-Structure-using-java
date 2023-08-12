package Heaps;
import java.util.*;

public class ConnectNRope {

    public static void main(String[] args) {
        
        int ropes[] = {2, 3, 3, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //step 1 add all elements in pq in ascending order
        for(int i=0; i<ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        //step 2 cal sum of min1 and min2 value 
        while(pq.size() > 1) { // until only 1 value remaining in pq
         
           int min1 = pq.remove();
           int min2 = pq.remove();

           cost += min1 + min2;

           pq.add(min1 + min2); //not adding cost because the value of cost changing until last element
        }

        System.out.println("cost to connect all ropes are: "+cost);

    }
    
}
