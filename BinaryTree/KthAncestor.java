package BinaryTree;

public class KthAncestor {
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

    public static int kthAnces(Node root, int node, int k) {

        if(root == null) {
            return -1;
        }

        if(root.data == node) {
            return 0;
        }

        // check in left or right
        int leftSub = kthAnces(root.left, node,k);

        int rightSub = kthAnces(root.right, node, k);

        if(leftSub == -1 && rightSub == -1) {
            return -1;
        }

        // or if ans in store in left o right so we get it through max function
        // let left return us 1 or right -1 so ans will be 1

        int max = Math.max(leftSub, rightSub);

        if(max+1 == k) {
            System.out.println(root.data);
        }

        return max+1;

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

       int n1=4, n2 =1;

       kthAnces(root, n1, n2);
   }
}
