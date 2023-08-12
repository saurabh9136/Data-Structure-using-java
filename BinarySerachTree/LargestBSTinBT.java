package BinarySerachTree;

public class LargestBSTinBT {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public  Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    // now craeting a static var which track the number of nodes which make a BST
    static int maxBST = 0;

    public static Info largestBST(Node root) {

        // bc
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // now get the information of left & right subtrees

        Info leftInfo = largestBST(root.left); //left
        Info rightInfo = largestBST(root.right); //right

        // get size = left child + right child + 1 
        int size = leftInfo.size + rightInfo.size +1; // calculate size
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min)); //min value = root.data,leftsubt,rightsubt
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max)); //max value = root.data,leftsubt,rightsubt

        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {// cond if tree is BST or Not
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST) { // if BST then increment the size of maxBST
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max); // and return new node with true value
        }

        return new Info(false, size, min, max); // return
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

    //    Info info = largestBST(root);

        System.out.println("max Number of BST Nodes are: " + maxBST);

    }
    
}
