package Queues;
import java.util.*;

public class QueueInJCF {

    public static void main(String args[]) {

      // Queue<Integer> q = new LinkedList<>(); // because queue is interface not a class 
      Queue<Integer> q = new ArrayDeque<>(); // alos use this deque as object

       q.add(1);
       q.add(2);
       q.add(3);

    while(!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }
    }
    
}
