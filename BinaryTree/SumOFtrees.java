package BinaryTree;

public class SumOFtrees {
    static class Node {
        
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root) {

        if(root == null) { // means no node then count = 0 
            return 0;
        }

        // now save the sum of left
        int lsum = sum(root.left);
        // same for right
        int rsum = sum(root.right);

        // simply return the  sum of lsum or rsum + data of each node

        return lsum+rsum+root.data;
    }

    public static void main(String[] args) {
        /*
                   1
                  / \
                 2    3
                / \  /  \
               4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);   
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        System.out.println(sum(root));
    }
}
