package Queues;
import java.util.*;

public class ConnectNRopes {

    public static int connectRopes(int arr[], int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        int res = 0;

        for(int i=0; i<n; i++) {
            pq.add(arr[i]);
        }

        while(pq.size() > 1) {
          
            int first = pq.poll();
            int second  = pq.poll();

            res = res+(first+second);
            pq.add(first + second);
        }

        return res;
     
    }

    public static void main(String[] args) {
      int arr[] = {1, 2, 3};
      int n = 3;
        
        connectRopes(arr,n);

      System.out.println(connectRopes(arr, n)); 

    }
    
}
