package BinarySerachTree;

public class DeleteNode {

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

    public static Node deleteInBST(Node root, int val) {

        // case 1
        if(root.data < val) { // value occur at right sub tree
            root.right = deleteInBST(root.right, val);
        } 
        else if (root .data > val) { // when value occur at left sub tree
            root.left = deleteInBST(root.left, val);
        }
        else { // voila
           
            // case 1 : leaf Node
            if(root.left == null && root.right == null) {
                return null; // directly points to null so jgc delete it
            }

            // case 2 : single Child node
            if(root.left == null) {
                return root.right;
            }

            if(root.right == null) {
                return root.left;
            }

            // case 3: two child

            Node IS = findInorderSuccessor(root.right); //because inorder successor occurs on right sub tree
            root.data = IS.data;
            root.right = deleteInBST(root.right, IS.data);           
            
        }

        return root;
    }

        public static Node findInorderSuccessor(Node root) {

            while(root.left != null) {
                root = root.left;
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
    
    public static void main(String[] args) {
        int Values[] = {6, 7, 1, 3, 2, 4, 5, 9, 8, 10};

        Node root = null;

        // now put the values into node to build tree
        for(int i=0; i<Values.length; i++) {

            
            root = builTree(root, Values[i]);
        }
        inOrder(root);
        System.out.println();

        deleteInBST(root, 6);
        System.out.println();

        inOrder(root);

    }
    
}
