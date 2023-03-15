package Queues;
import java.util.*;

public class StackUsingToQue {

    public static class Stack {

        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        
        // now first check is both que is empty or not
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // now add or push the element into que
        public static void push(int data) {
            if(!q1.isEmpty()) {

              q1.add(data);
            }else {
                q2.add(data);
            }
        }

        // now remove the data from q1 to q2

        public static int pop() {

            if(isEmpty()) {
                System.out.println("que is empty");
                return -1;
            }
            int top = -1;

            if(!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()) {
                       break;
                    }
                    q2.add(top);
                }
            }else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) {
                       break;
                    }
                      q1.add(top);
                }           
            }
            return top;
            }
            public static int peek() {
                if(isEmpty()) {
                    System.out.println("que is empty");
                    return -1;
                }
                int top = -1;
    
                if(!q1.isEmpty()) {
                    while (!q1.isEmpty()) {
                        top = q1.remove();                        
                        q2.add(top);
                    }
                }else {
                    while (!q2.isEmpty()) {
                        top = q2.remove();                       
                        q1.add(top);
                    }
                }
            return top;
        }
       
    }   

    public static void main(String[] args) {
        
     /*   Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }*/
    }
}
