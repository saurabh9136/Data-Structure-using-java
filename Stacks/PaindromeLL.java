package Stacks;
import java.util.*;

public class PaindromeLL {
    
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isPlaind(Node list) {
        Stack<Character> s = new Stack<>();

        Node temp = head;
        Node slow = head;
        Node fast = head;
        while(temp != null) {
           slow = slow.next;
           fast = fast.next;
        }

        Node mid = slow;
        while(head != mid ) {
           char ch = (char)head.data;
           s.push(ch);
           head = head.next;

        }

        while( mid != null && s.peek() == mid.data) {            
                s.pop();    
                mid = mid.next;        
        }
        if(s.isEmpty()) {
            return true;
        }else {
            return false;
        }        
    }

    public static void main(String[] args) {
        Node one = new Node('A');
        Node two = new Node('G');
        Node three = new Node('C');
        Node four = new Node('B');
        Node five = new Node('A');

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;

        System.out.println(isPlaind(one));

    }
}
