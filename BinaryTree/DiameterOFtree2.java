package BinaryTree;

public class DiameterOFtree2 {

    // ptimized approch
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

    static class Info {
        int diamtr;
        int ht;

        public Info(int diamtr, int ht) {
            this.diamtr = diamtr;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root) {
        
        // base case when node = null then height = diameter = 0
        if(root == null) {

            return new Info(0, 0);
        }

        // now call for Info and cal left and right info of ht or dt in tree

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        // now cal the diameter \
        int diam = Math.max(Math.max(leftInfo.diamtr, rightInfo.diamtr), leftInfo.ht + rightInfo.ht +1);
        // max of (ld , rd, (lh+rh+1))

        int height = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, height);
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
        root.right.right = new Node(7);
        root.right.left = new Node(6);       

        System.out.println(diameter(root).ht);
    }
    
}
