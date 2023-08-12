package SegmentTree;


public class ConstructioOfST {
    static int tree[];

    public static void init(int n) {
        tree = new int[4*n];
    }

    public static int constructST(int arr[], int i, int start, int end) {

        // base case
        if(start == end) { // 0,0 1,1 2,2
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        constructST(arr, 2*i+1, start, mid); //left subtree we cant save this value in any var
        constructST(arr, 2*i+2, mid+1, end); // right subtree

        tree[i] = tree[2*i+1] + tree[2*i+2]; // with this formula we did'nt use any other var to store the data
        return tree[i];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        init(n);
        constructST(arr, 0, 0, n-1);

        for(int i=0; i<tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
}
