package BinaryTree;

public class MirrorBinaryTree {

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

    
    public static void mirrorBin(Node root) {
        // so smple first right node then left node

        if(root == null  ){
            return;
        }

        System.out.print(root.data+" ");
        mirrorBin(root.right);
        mirrorBin(root.left);
        
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
       root.right.left = new Node(6);
       root.right.right = new Node(7);

       mirrorBin(root);
       System.out.println();
      // mirrorBin(root);
      
         
   }
    
}
