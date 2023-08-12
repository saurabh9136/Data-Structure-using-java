package BinarySerachTree;

public class PrintInRange {

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

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        printInRange(root.left, k1, k2);
        if(root.data >= k1 && root.data <= k2) {
            System.out.print(root.data+" ");
        }        
        printInRange(root.right, k1, k2);
        
    }
    public static void main(String[] args) {
        int Values[] = {1, 3, 4, 5, 6, 8, 10, 11, 14};

        Node root = null;

        // now put the values into node to build tree
        for(int i=0; i<Values.length; i++) {

            
            root = builTree(root, Values[i]);
        }

        printInRange(root, 1, 4);  
        System.out.println();
    }
    
}
