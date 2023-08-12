package Heaps;
import java.util.*;

public class SlidingWindowMax {

    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            //sort in decsending order
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        int res[] = new int[arr.length-1-k+1]; // n-k+1
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //1 st create a window
        for(int i=0; i<k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        // the first result is max of window
        res[0] = pq.peek().val;
        
        // now for other value in arr
        for(int i=k; i<arr.length; i++) {
            while(pq.size() > 0 && pq.peek().idx <= k-1) { 
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;  

        }

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}