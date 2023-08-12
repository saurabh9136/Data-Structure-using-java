package BinarySerachTree;

public class SearchInBST {
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

    public  static boolean search(Node root, int key) {
        if(root == null ) {
            return false;
        }

        if(root.data == key) {
            return true;
        }
        // directly return the value
        if(root.data > key) {
          return search(root.left, key);
        } else {
          return search(root.right, key);
        }

        
    }

    public static void main(String[] args) {
        int Values[] = {6, 7, 1, 3, 2, 4, 5, 9, 8, 10};

        Node root = null;

        // now put the values into node to build tree
        for(int i=0; i<Values.length; i++) {

            
            root = builTree(root, Values[i]);
        }

        System.out.println(search(root, 7));
        

    }
}
