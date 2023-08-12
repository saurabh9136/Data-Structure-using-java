package BinaryTree;
import java.util.*;

public class BuildTree {
    // first intit the node 
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

    static class BinaryTrees {
    // *****this index track the data of nodes array and build according to it ***
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
         idx++;           
         if(nodes[idx] == -1) {
             return null;
         }

         // now create a new Node
         Node newNode = new Node(nodes[idx]); // according to data of nodes

         // the root node has been init now 1st step to init left node
         newNode.left = buildTree(nodes);

         // now init for right node
         newNode.right = buildTree(nodes);

         return newNode;
        }

        // code for printing tree in Preorder 1st root 2nd left 3rd right

        public static void preorder(Node root) {

            // base case when by treversing we go to leaf node
            if(root == null) {               
                return;
            }

            // 1st root
            System.out.print(root.data+" ");
            // 2nd left
            preorder(root.left);
            // 3rd for right
            preorder(root.right);
          
        }

         // code for printing tree in **Inorder** 

        public static void inorder(Node root) {
            // steps 1st left 2nd root 3rd right

            //bc
            if(root == null) {
                return;
            }

            inorder(root.left); //left
            System.out.print(root.data+" "); //root
            inorder(root.right);// right
        } 

         // code for printing tree in **Postrder**
         
         public static void postOrder(Node root) { //1st left 2nd right 3rd root

            //bc
            if(root == null) {
                return;
            }

            postOrder(root.left); //1st
            postOrder(root.right); //2nd
            System.out.print(root.data+" "); // root

        }

        // code for printing tree in **levelOrderTraversal**

        public static void levelOrder(Node root) {

            if(root == null) {
                return;
            }

            // creating queue which store data of nodes
            Queue<Node> q = new LinkedList<>();

            // add first value of tree with null
            q.add(root);
            q.add(null);

            while(!q.isEmpty() ) {
                // create a node which track the nodes inside the tree
                Node curr = q.remove(); //store the data of queue

                if(curr == null) {
                    System.out.println();
                    if(q.isEmpty() ) {
                        break;
                    }else {
                        q.add(null);
                    }
                } else {
                     // now check for left and right
                    System.out.print(curr.data+" ");
 
                     if(curr.left != null) {
                       q.add(curr.left);
                     }

                    if(curr.right != null) {
                       q.add(curr.right);
                    }
                }

                
            }
        }
    }


    public static void main(String[] args) {
        
      //  int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // cretae obnj of bintree class
       // BinaryTrees tree = new BinaryTrees();
       
       // Node root = tree.buildTree(nodes);
     //   tree.preorder(root);   
    //    System.out.println();     
      //  tree.inorder(root);
      //  System.out.println();
      //  tree.postOrder(root);
       //   tree.levelOrder(root);

    }
    
}
