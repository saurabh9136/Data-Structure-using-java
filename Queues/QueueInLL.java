package Queues;

public class QueueInLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }  
    }

    static Node head = null;
    static Node tail = null;

    static class Queue {

        public static boolean isEmpty() {
            return head == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = tail = newNode;
            }

            tail.next = newNode; // tail is rear part of Queuse
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) {
                return -1;
            }
            int front = head.data;
            head = head.next;
            return front;
        }

        public static int peek() {

            if(isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        
     /*   Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        } */
    }
    
}
