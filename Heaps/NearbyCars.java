package Heaps;
import java.util.*;

public class NearbyCars {
    
    static class Points implements Comparable<Points> {

        int x; //x axis
        int y; // y axis
        int distSq;
        int idx;

        public Points(int x, int y, int distSq, int idx) {
        this.x = x; //x axis
        this.y = y; // y axis
        this.distSq = distSq;
        this.idx = idx;
        }

        // now use heap manual implement and compare with distance 
        @Override
        public int compareTo(Points p2) {
            return this.distSq - p2.distSq;           
            
        }
    }
  
    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i = 0; i<pts.length; i++) {
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1]; //0 = x, y=1
            pq.add(new Points(pts[i][0], pts[i][1], distSq, i));
        }

        // print the distance of cars
        for(int i=0; i<k; i++) {
            System.out.println("C"+ pq.remove().idx);
        }
    }
}
