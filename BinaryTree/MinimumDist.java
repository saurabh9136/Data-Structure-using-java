package BinaryTree;

public class MinimumDist {

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

    // now write a functiom to cal LCA
    public static Node lca(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

       Node left = lca(root.left, n1, n2);
       Node right = lca(root.right, n1, n2);

       // now check at which subtree value exist
       if(left == null) {
           return right; //means value exist in right
       }

       if(right == null) {
           return left; //value exist in right subtree
       }

       return root;
    }

    public static int distance(Node root, int n) {
        if(root == null) {
            return -1;
        }

        if(root.data == n) {
            return 0;
        }

        int leftdis = distance(root.left, n);
        int rightdis = distance(root.right, n);

        if(leftdis == -1 && rightdis == -1 ) {
            return -1;
        } else if (rightdis == -1) {
            return leftdis+1;
        } else {
            return rightdis+1;
        }
    }

    public static int minDis(Node root, int n1, int n2) {

        Node lca = lca(root, n1, n2);
        int dis1 = distance(lca, n1);
        int dis2 = distance(lca, n2);

        return dis1+dis2;
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

        int n1=4, n2 =6;

        System.out.println(minDis(root, n1, n2));
    }
    
}
