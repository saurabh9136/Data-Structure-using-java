package BinarySerachTree;

public class CreateBalTree {

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


    public static Node createBalBST(int arr[], int si, int ei) {
        if(si > ei) {
            return null;
        }

        int mid = (si+ei)/2;

        Node root = new Node(arr[mid]);

        root.left = createBalBST(arr, si, mid-1);
        root.right = createBalBST(arr, mid+1, ei);

        return root;
    }

    public static void preOrder(Node root) {

        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        int si = 0;
        int ei = arr.length-1;

        Node root = createBalBST(arr, si, ei);
        preOrder(root);
        System.out.println();
    }
    
}
