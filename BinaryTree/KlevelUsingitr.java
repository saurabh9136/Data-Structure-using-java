package BinaryTree;
import java.util.*;

public class KlevelUsingitr {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kLevel(Node root, int level, int k) {

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {

            Node curr = q.remove();

            if(curr == null) {
                if(level == k) {
                    System.out.print(root.data);
                } else if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }

            } else {

                if(level == k) {
                    System.out.print(root.data);
                }

                if(curr.left != null) {
                    q.add(curr.left);
                  }

                 if(curr.right != null) {
                    q.add(curr.right);
                 }
            }

            level++;
        }
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2;
        kLevel(root, 1, k);

    }
    
}
