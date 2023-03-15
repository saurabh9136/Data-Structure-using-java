package LinkedList;
import java.util.LinkedList;

public class InbuiltMethods {

    public static void main(String[] args){

     // initalisation of ll
     LinkedList<Integer> ll = new LinkedList<>();
     // some operation
     ll.addLast(1);
     ll.addLast(2);
     ll.addFirst(0);

     // print
     System.out.println(ll);
     // remove
     ll.removeFirst();
     ll.removeLast();
     System.out.println(ll);
    } 
}
