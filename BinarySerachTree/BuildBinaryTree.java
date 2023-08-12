package BinarySerachTree;

public class BuildBinaryTree {
    
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

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }        
        System.out.print(root.data+ " ");
        inOrder(root.left);
        inOrder(root.right);
    } 

    public static void main(String[] args) {
        int Values[] = {6, 7, 1, 3, 2, 4, 5, 9, 8, 10};

        Node root = null;

        // now put the values into node to build tree
        for(int i=0; i<Values.length; i++) {

            
            root = builTree(root, Values[i]);
        }

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();

    }
}
