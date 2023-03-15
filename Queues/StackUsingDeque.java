package Queues;
import java.util.*;

public class StackUsingDeque {

    static class Stack {

       static Deque<Integer> deque = new LinkedList<>();

        // push
        public static void push(int data) {
            deque.addLast(data);
        }

        //pop
        public static int pop() {
            return deque.removeLast();
        }

        //peek
        public static int peek() {
            return deque.getLast();
        }
    }

    static class Queue {
        static Deque<Integer> deq = new LinkedList<>();

        // add
        public static void add(int data) {
            deq.addLast(data);
        }

        // remove

        public static int remove() {
            return deq.removeFirst();
        }

        //peek

        public static int peek() {
            return deq.getFirst();
        }

    }
    
    public static void main(String[] args) {
        
   /*     Stack s  = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
  
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        */
        /*
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek is: "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        */
    }

}
