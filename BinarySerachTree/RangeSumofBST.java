package BinarySerachTree;
import java.util.*;

public class RangeSumofBST {

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data =  data;
            this.left =  null;
            this.right = null;
        }
    }

    public static void printArray(ArrayList<Integer> list) {

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        
    }
    
    static int sum = 0;
    public static void sumOfRange(Node root, int l, int r) {

        if(root == null) {
            return ;
        }

        ArrayList<Integer> list= new ArrayList<>();      
        
        if(root.data >= l && root.data <=r) {
            list.add(root.data);
            sum+= root.data;
        }
        sumOfRange(root.left, l, r);
        sumOfRange(root.right, l, r);

        printArray(list);        
    }
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(15);
        root.right.right = new Node(18);

        sumOfRange(root, 7, 15);
        System.out.println();
        System.out.println("max number of range is: "+sum);


    }
}
