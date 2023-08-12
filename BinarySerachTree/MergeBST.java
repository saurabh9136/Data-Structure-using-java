package BinarySerachTree;
import java.util.*;

public class MergeBST {

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

    public static void inOrderSeq(Node root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }

        inOrderSeq(root.left, list);
        list.add(root.data);
        inOrderSeq(root.right, list);        
    }

    public static Node createBalBST(ArrayList<Integer> finalList, int st, int end) {

        if(st > end) {
            return null;
        }

        int mid = (st+end)/2;

        Node root = new Node(finalList.get(mid));

        root.left = createBalBST(finalList, st, mid-1);
        root.right = createBalBST(finalList, mid+1, end);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2 ) {
        //step 1
        ArrayList<Integer> list1 = new ArrayList<>();
        inOrderSeq(root1, list1);
        //step 2
        ArrayList<Integer> list2 = new ArrayList<>();
        inOrderSeq(root2, list2);
       
        //step 3 merge
        int i =0 , j=0;
        ArrayList<Integer> finalList = new ArrayList<>();
      
        while( i < list1.size() && j < list2.size()) {
 
            if(list1.get(i) <= list2.get(j)) {

                finalList.add(list1.get(i));
                i++;
            } else {
                finalList.add(list2.get(j));
                j++;
            }
        }

        // corner cases where some element are remaninig in any array

        while(i < list1.size()) {
            finalList.add(list1.get(i));
            i++;
        }

        while(j < list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }

        //4th step to create a balanced tree using sorted array which is- finalList

        return createBalBST(finalList, 0, finalList.size()-1);

    }


    public static void printPreOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public static void main(String[] args) {
        

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);

        printPreOrder(root);
        System.out.println();
    }
    
}
