package Queues;
import java.util.*;

public class ReverseKelmnt {

    public static void reversekelements(Queue<Integer> q, int k) {
      Stack<Integer> s = new Stack<>();
       for(int i=0; i<k; i++) {
          s.push(q.remove());
          q.add(s.pop());
      }

    }

    public static void main(String[] args) {
        
         Queue<Integer> q = new LinkedList<>();

         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         q.add(6);
         q.add(7);
         q.add(8);
         q.add(9);
         q.add(10);
        int k = 5;
         reversekelements(q, k);

         while(!q.isEmpty()) {
             System.out.print(q.remove()+" ");
         }

    }
    
}
