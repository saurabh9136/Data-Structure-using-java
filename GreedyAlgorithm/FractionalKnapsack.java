package GreedyAlgorithm;
import java.util.*;
public class FractionalKnapsack {

    public static void main(String[] args) {
        
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        // calculate the ratio
        double ratio[][] = new double[val.length][2];

        for(int i=0; i<val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1]= val[i] /(double) weight[i];
        }
        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        //now the ratio in asc order but we need in dec order because the largest ratio is better to put into knapsack
        int capacity = w;
        int finalVal = 0;
        for(int i=ratio.length-1; i>=0; i--) {
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]) { //full weight
                finalVal += val[index];
                capacity -= weight[index];
            }else {
               // include fractional
               finalVal += (ratio[i][1] * capacity);
               capacity = 0;
               break;
            }
        } 

        System.out.println("maximum value = "+finalVal);
    }    
}
