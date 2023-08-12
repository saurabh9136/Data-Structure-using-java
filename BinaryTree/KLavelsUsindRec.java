package BinaryTree;

public class KLavelsUsindRec {

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

        if(root == null ) {
            return;
        }

        // first step caluculate 
        if(level == k) {
            System.out.print(root.data+" ");
        }

        // or check for other levels
        kLevel(root.left, level+1, k); //at every level val has been increase

        kLevel(root.right, level+1, k);

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
