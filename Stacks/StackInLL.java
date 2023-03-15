package Stacks;

public class StackInLL {
    // first create a new class which denote a node
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
         static Node head = null;

        public static boolean isEmpty() {
           return head == null;
        }
        // add function push
        public static void push(int data) {
          Node newNode = new Node(data);

          if(isEmpty()) {
              head = newNode;
              return;
          }

          newNode.next = head;
          head = newNode;
        }     
        // pop function
        public static int pop() {
            if(isEmpty()) {                
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }   
        // peek 
        public static int peek() {
            if(isEmpty()) {                
                return -1;
            }

            return head.data;
        }  
    
    }

    public static void main(String[] args) {
       // Stack sll = new Stack();

     /*   sll.push(1);
        sll.push(2);
        sll.push(3);
        while(!sll.isEmpty()){
            System.out.println(sll.peek());
            sll.pop();
        }   */    
    }
}
