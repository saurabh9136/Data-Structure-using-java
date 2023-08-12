package GreedyAlgorithm;
import java.util.*;

public class ChainLen {
    public static void main(String[] args) {
        
        int pairs[][] = {{5, 24}, {39,60}, {5, 28}, {27,40}, {50,90}};

        // now the logic as same as Acticity Selection

        // sort the second also ending length
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chaiLen = 1; //0 is alreay choosen
        int lastLen = pairs[0][1]; // last number of pair

        for(int i=0; i<pairs.length; i++) {
            if(pairs[i][0] >= lastLen) { // check the condition
                chaiLen++; // increment the value
                lastLen = pairs[i][1]; // update the value of lastlen
            }
        }

        System.out.println("legth of chain is: "+chaiLen);
    }
    
}
