package LinkedList;

public class DoubleLL {
    
    public class Node{
     
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    public void addFirst(int data){
      // first crete new node
      Node newNode = new Node(data);
      size++;

      if(head == null){
          head=tail=newNode;
          return;
      }
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }

    public int removeFisrt(){
        if(head == null){
            System.out.println("Dll is empty");
            return Integer.MAX_VALUE;
        }
        // if only one dll exist
        if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;       
    }
    public void printNode(){
     Node temp = head;
     if(head == null){
         System.out.println("dll is empty");
     }
     while(temp!= null){
         System.out.print(temp.data+"<->");
         temp = temp.next;
     }
     System.out.println("null");//once cond hit then it's stand on null node then just print null
    }
// reverse doubly linked list
    public void reverseDll(){
       Node curr = head;
       Node prev = null;
       Node next;

       while(curr != null) {
           next = curr.next;
           curr.next = prev;
           curr.prev = next;
           
           prev = curr;
           curr = next;
       }

       head = prev;
    }    
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printNode();
        dll.reverseDll();      
        dll.printNode();
        System.out.println(dll.size);
    }
    
}
