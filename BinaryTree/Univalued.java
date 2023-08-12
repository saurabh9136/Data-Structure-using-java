package BinaryTree;

public class Univalued {

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

    public static boolean isUnivalued(Node root) {

        if(root == null) {
            return true;
        }     
   

        if(root.left != null && root.data != root.left.data) {
            return false;
        }   

        if(root.right != null && root.data != root.right.data) {
            return false;
        }

        return isUnivalued(root.left) && isUnivalued(root.right);
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
       root.left = new Node(1);
       root.right = new Node(1);
       root.left.left = new Node(1);
       root.left.right = new Node(1);
       root.right.left = new Node(1);
       root.right.right = new Node(1);
      if(isUnivalued(root) ) {
          System.out.println("yes");
      } else {
          System.out.println("No");
      }
             
   }
    
}
