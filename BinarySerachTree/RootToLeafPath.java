package BinarySerachTree;
import java.util.*;



public class RootToLeafPath {

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

    public static void print(ArrayList<Integer> path) {
        for(int i=0 ;i<path.size(); i++) {
            System.out.print(path.get(i) +"->");
        }
        System.out.println("null");
    }

    public static void rootToLeafPath(Node root, ArrayList<Integer> path) {      

        if(root == null) {
            return;
        }      
        // case 1 add 
        path.add(root.data);
        
        if(root.left == null && root.right == null) {
            print(path);
        }

        rootToLeafPath(root.left, path);
        rootToLeafPath(root.right, path);

        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int Values[] = {8, 5, 3, 6, 10, 11, 14};

        Node root = null;

        // now put the values into node to build tree
        for(int i=0; i<Values.length; i++) {

            
            root = builTree(root, Values[i]);
        }

        rootToLeafPath(root, new ArrayList<>());
        
    }
    
}
