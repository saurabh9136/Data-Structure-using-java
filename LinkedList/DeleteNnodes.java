package LinkedList;

public class DeleteNnodes {
 
    static class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        if(head == null) {
           head = tail = newNode;
           return;
        }
      
        newNode.next = head;
        head = newNode;
    }
   
    public void printNode() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void DeleteNnode(int n, int m) {


    }
    public static void main(String[] args) {
        DeleteNnodes dll = new DeleteNnodes();
       // int n =2, m=2;
        dll.addFirst(8);
        dll.addFirst(7);
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printNode();
        
    }
}
