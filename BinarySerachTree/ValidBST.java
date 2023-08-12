package BinarySerachTree;

public class ValidBST {
    
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

    public static Node builTree(Node root, int Values) {

        // first step create a Node or points at root tree
        if(root == null) {
           return root = new Node(Values);
        }

        if(root.data < Values) {
            root.right = builTree(root.right, Values);
        } else {
            root.left = builTree(root.left, Values);
        }

        return root;
    } 
    
    public static boolean isValid(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && min.data >= root.data) {
            return false;
        }

        if(max != null && max.data <= root.data) {
            return false;
        }
        // now check in subgtrees where in left the max value is node & in right the min value in also node
        // according to cond if both crieteria match then it is a valis BST
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    public static void printinMirror(Node root) {

        if(root == null) {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;


        System.out.print(root.data +" ");
        printinMirror(root.left);
        
        printinMirror(root.right);

    
    }
    public static void main(String[] args) {
        int Values[] = {8, 5,6,  3, 10, 11};

        Node root = null;

        // now put the values into node to build tree
        for(int i=0; i<Values.length; i++) {

            
            root = builTree(root, Values[i]);
        }

        if(isValid(root, null, null)) {
            System.out.println("valid BST");
        } else {
            System.out.println("Not Valid");
        }
        System.out.println();
        printinMirror(root);
        
    }
}
