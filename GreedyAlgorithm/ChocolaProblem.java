package GreedyAlgorithm;
import java.util.*;

public class ChocolaProblem {

    public static void main(String[] args) {
    //    int n = 4;
    //    int  m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};
 
        // sor in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int v = 0, h=0;
        int vp=1; int hp =1;
        int cost=0;

        while(v < costVer.length && h < costHor.length) {
           
            if(costVer[v] <= costHor[h] ) { // horizontal cut
               cost += (costHor[h] * vp); // because it cuts the vp 
               h++;
               hp++; // horizontal pieces are increased
            } else { // when we need to cut in vertical
              cost += (costVer[v] * hp); // cuts horizontal
              v++;
              vp++;
            }
        }
        // at some point the length of hori/vetic is finished then we need to run loop for remaining cost individula

        while(h < costHor.length) { // for h
            cost += (costHor[h] * vp); // because it cuts the vp 
            h++;
            hp++; 
        }
        while( v < costVer.length) {
            cost += (costVer[v] * hp); // cuts horizontal
            v++;
            vp++;
        }       
        System.out.println("min cost to cut a chocolate is "+ cost);     

    }
    
}
