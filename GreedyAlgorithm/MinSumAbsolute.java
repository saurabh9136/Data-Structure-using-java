package GreedyAlgorithm;
import java.util.*;

public class MinSumAbsolute {

    public static void main(String[] args) {
        
        int A[] = {4, 2,6, 8, 6, 5, 3, 1};
        int B[] = {4, 10, 5, 2, 12, 14, 2,  8};

        // sort both array in ascending order
        Arrays.sort(A);
        Arrays.sort(B);

        // now bothh are sorted cal the min absolute value of both 
        int minAbsolut = 0;
        for(int i=0; i<A.length; i++) {

            minAbsolut += Math.abs(A[i]- B[i]);// algo to cal absolute 
        }

        System.out.println("MIn absoult is: "+minAbsolut);
    }    
}
