package DynammicPrograming;

public class KnapSack {
   // using recursion
    public static int knapSack(int val[], int wt[], int w, int n) {
        if( w== 0 || n==0) {
            return 0;
        }

        if(wt[n-1] <= w) { // valid cond -> n-1 = index
           // include 
           int ans1 = val[n-1] + knapSack(val, wt, w-wt[n-1], n-1); // add value of n-1 index with total
           // Exclude
           int ans2 = knapSack(val, wt, w, n-1); // not add any value
           // now return the max value from ans1 and ans 2
           return Math.max(ans1, ans2);
        } else { // invalid then check for next level
            return  knapSack(val, wt, w, n-1);
        }
    }

    // using recursion + memoization
    public static int knapSackMemo(int val[], int wt[], int w, int n, int[][] dp) {
        if(n == 0 || w == 0) {
            return 0;
        }
        if(dp[n][w] != -1) {
            return dp[n][w];
        }

        if(wt[n-1] <= w) {
           // include
           int ans1 = val[n-1]+knapSackMemo(val, wt, w-wt[n-1], n-1, dp);

           // exclude
           int ans2 = knapSackMemo(val, wt, w, n-1, dp);
           dp[n][w] = Math.max(ans1, ans2);
           return dp[n][w];
        } else {
            dp[n][w] = knapSack(val, wt, w, n-1);
            return dp[n][w];
        }
    }

    // using Tabulation
    public static int knapSackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        // init the 0th row and oth col with 0
        for(int i=0; i<n+1; i++) { //0th col
            dp[i][0] = 0;
        }
        for(int i=0; i<W+1; i++) { //0th row
            dp[0][i] = 0;
        }

        // Tabulation 
        for(int i=1; i<n+1; i++) { 
            for(int j=1; j<W+1; j++) {
                int v = val[i-1]; //ith item val
                int cap = wt[i-1]; // ith item wt

                if(cap <= j) { // valid
                    int incPro = v + dp[i-1][j-cap]; // include
                    int excPro = dp[i-1][j]; // exclude

                    dp[i][j] = Math.max(incPro, excPro);
                } else { // invalid
                    int excPro = dp[i-1][j];
                    dp[i][j] = excPro;
                }
            }
        }
        return dp[n][W];

    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7; //tortal weight of knapsack
        int dp[][] = new int[val.length+1][w+1];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

      //  System.out.println(knapSack(val, wt, w, val.length));
      ///  System.out.println(knapSackMemo(val, wt, w, val.length, dp));
        System.out.println(knapSackTab(val, wt, w));
    }
    
}
