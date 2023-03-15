package Queues;

import java.util.*;

public class QueueUSintToStacks {

     static class Queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

       public static boolean isEmpty() {
           return s1.isEmpty();
       }
// addd
       public static void add(int data) {
           while(!s1.isEmpty() ) {
               s2.push(s1.pop());
           }

           s1.push(data);
           while(!s2.isEmpty() ) {
            s1.push(s2.pop());
        }
    }
// remove
        public static int remove() {
           if(isEmpty()) {
               return -1;
           }

           return s1.pop(); //bexause now the first elemnt is on top(peek) of the stack
        }
      
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return s1.peek();
 
        }
       
    }

    public static void main(String[] args) {
        
   /*    Queue q = new Queue(); //creating object o class
       q.add(1);
       q.add(2);
       q.add(3);


       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();
       }*/
    }
    
}
