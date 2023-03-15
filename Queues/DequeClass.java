package Queues;
import java.util.*;

public class DequeClass { // deque is diffrent from dequeue please note

    public static void main(String[] args) {
        
        Deque<Integer> deque = new  LinkedList<>();

        // add element to first
        deque.addFirst(2);
        deque.addFirst(1);
        
        //add element to Last
        deque.addLast(3);
        deque.addLast(4);

        // print element
        System.out.println(deque);

        //remoeve from first
        deque.removeFirst();

        //remove from Last
        deque.removeLast();

        //now get first element = peek
        System.out.println(deque.getFirst());

        // now get last element 
        System.out.println(deque.getLast());

    }
    
}
