package LinkedList;

public class FoundIntersect {
    static class Node{

        int data; // intitalize the value 
        Node next; // create next node

        public Node(int data){ // constructor
            this.data = data;
            this.next = null;
        }
    }
    public Node intersect(Node head1, Node head2){ // take two node as parameter
       while(head2 != null){  // cond where head2 is not null
        Node temp = head1; //init temp var who track the head1 ll
        while(temp != null ){ // cond 
            if(temp == head2){ // if both node are same
                return head2;// returning the head2 bcaus temp is not a real ll
            }
           temp = temp.next; // update the temp value
           
        }  
        head2 = head2.next;            // update the head2 ll value
       }
       return null; // both are false then returning the null 
    }
    public static void main(String[] args) {
        FoundIntersect ll = new FoundIntersect();
        Node head1, head2;
        head1 = new Node(1);
        head2 = new Node(4);
        Node newNode = new Node(2);
        head2.next = newNode;

        newNode = new Node(3);
        head2.next.next = newNode;

        newNode = new Node(5);
        head1.next = newNode;

        newNode = new Node(6);
        head1.next.next = newNode;
        head2.next.next.next = newNode; 

        newNode = new Node(7);
        head1.next.next.next = newNode;

        head1.next.next.next.next = null;
        Node intersectionPoint = ll.intersect(head1, head2);

        if (intersectionPoint == null) {
        System.out.print(" No Intersection Point \n");
         }
         else {
        System.out.print("Intersection Point: " + intersectionPoint.data +"\n");       
        }        
    } 
}
