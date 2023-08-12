package DynammicPrograming;

//import java.util.Arrays;

public class MCM {
    //Matrix chain Mumltiplication

    // recursion
    public static int matrixChain(int arr[], int i, int j) {

        if(i==j) {
            return 0; // single matrix
        }
        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = matrixChain(arr, i, k);
            int cost2 = matrixChain(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }
    public static int mcmMeo(int arr[], int i, int j, int dp[][] ) {
        if(i == j) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcmMeo(arr, i, k, dp);
            int cost2 = mcmMeo(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[j] * arr[k];

            ans = Math.min(ans, cost1+cost2+cost3);
        }
        return dp[i][j] = ans;       

    }
    public static  void print(int dp[][]) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    } 
    public static int mcmTab(int arr[] ) {
        int n = arr.length;
        int dp[][] = new int[n][n]; //step1: create table
        
        for(int i=0; i<n; i++) { // initalization
            dp[i][i] = 0;// i == j = 0 diagnoly
        }
        // bottom up - filling
        for(int len=2; len<=n-1; len++) { // traverse diagonaly
            for(int i=1; i<=n-len; i++) { // because start with 1 
                int j = i+len-1; // column
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        System.out.println(mcmTab(arr));
    }
    
}
