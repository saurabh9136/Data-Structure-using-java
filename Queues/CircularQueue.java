package Queues;

public class CircularQueue {
    static class Queue {

        static int arr[]; // taking as quque
        static int size;  // size for arr
        static int rear; // if vaue inserted in queue then rear move in right direction
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
           
            return rear == -1;
        } 

        public static boolean isFull() {
            return (rear + 1)%size == front; // when size of rear or front are equalt then queue is full
        }

        public static void add(int data) {
            if( isFull() ) {
                System.out.println("queue is full");
                return;
            }           
            // add first element
            if(front == front-1){
               front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            } 
            int result = arr[front];      

           if(rear == front) { // last element 
               rear = front = -1;
           } else {
               front = (front + 1) % size;
           }
           return result;            
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }   

    public static void main(String[] args) {
        
    /*    Queue q = new Queue(3);

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }*/
    }
}
