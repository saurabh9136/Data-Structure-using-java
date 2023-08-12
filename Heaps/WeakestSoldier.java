package Heaps;
import java.util.*;

public class WeakestSoldier {
    
    static class Row implements Comparable<Row> {

        int soldier; // count of sol
        int idx; // idx of row

        public Row(int soldier, int idx) {
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {

            if(this.soldier == r2.soldier) { // e compare if both same then we according to index
                return this.idx - r2.idx; //i < j
            } else {
                return this.soldier - r2.soldier; // if not same then according to soldier count
            }
        }

        public static void main(String[] args) {
            int[][] army = {{1, 0, 0, 0},
                           { 1, 1, 1, 1},
                           { 1, 0, 0, 0},
                            {1, 0, 0, 0}};

           int k=2;
           PriorityQueue<Row> pq = new PriorityQueue<>();           
           for(int i=0; i<army.length; i++) {
               int count= 0 ;
               for(int j=0; j<army[0].length; j++) {
                   count+= army[i][j] == 1 ? 1 : 0; // ior j == 1 then add 1 or else 0
               }

               pq.add(new Row(count, i));
           }

           for(int i=0; i<k; i++) {
            System.out.println("C"+pq.remove().idx);
           }
        }
    }
}
