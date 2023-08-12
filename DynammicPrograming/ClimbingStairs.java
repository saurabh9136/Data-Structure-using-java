package DynammicPrograming;
import java.util.*;

public class ClimbingStairs {
    //1: using Recusion O(2^n)
    public static int countStairs(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0 ) {
            return 0;
        }
        return countStairs(n-1) + countStairs(n-2);
    }

    //2: using Recursion + memoization O(n)
    public static int climbingStairs(int n, int dp[]) {
        if(n == 0) {
            return 1;
        }
        if(n < 0 ) {
            return 0;
        }
      
        Arrays.fill(dp, -1);
        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbingStairs(n-1, dp) + climbingStairs(n-2, dp);
        return dp[n];
    }

    // Tabulation -> create Table -> meaning of index -> fill (smallest to largest)
    public static int countStairsTab(int n) {
        int dp[] = new int[n+1];

        dp[0] = 1; // o is also a way 
        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n =5;
        int dp[] = new int[n+1];
        
        System.out.println(climbingStairs(n, dp));
        System.out.println(countStairs(n));
        System.out.println(countStairsTab(n));
    }
    
}
