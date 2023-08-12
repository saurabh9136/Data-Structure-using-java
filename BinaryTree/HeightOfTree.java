package BinaryTree;

public class HeightOfTree {

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

    public static int calHeightoftree(Node root) {

        if(root == null) {
            return 0;
        }

        // now save the height of left
        int lh = calHeightoftree(root.left);
        // same for right
        int rh = calHeightoftree(root.right);

        // simply return the max sum of lh or rh +1

        return Math.max(lh, rh) + 1;
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

        System.out.println(calHeightoftree(root));
    }
    
}
