package BinaryTree;
import java.util.*;

public class TopVeiw {
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

    // first create a class which contains the information of Node and Horizonatal distance

    static class Info {

        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // now create a function to calculate the hd 

    public static void topView(Node root) {
        // create a Queue & hashMap
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>(); //Intr = key, Node =val

        //first add the root in que
        q.add(new Info(root, 0));
        q.add(null); // track the next line

        int min=0,max=0;

        while(!q.isEmpty()) {

            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            } else {
                // now check if hd is lying other wise add it

                if(!map.containsKey(curr.hd)) {
                     map.put(curr.hd, curr.node);
                }

                 if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1)); //left = x-1
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1)); //left = x-1
                    max = Math.max(max, curr.hd+1);
                }
            }            
        }

        // print value of maps according to key 

        for(int i=min; i<=max; i++) {
            // map.get(I) = node and node is object so we call data using .data
            System.out.print(map.get(i).data +" ");
        }
        System.out.println();

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

        topView(root);
        
    }
    
}
