package DynammicPrograming;

public class TribonacciNum {
    public static int tribonacchi(int n, int dp[]) {
        if(n == 0 || n== 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        
        if(dp[n] != 0) {
            return dp[n];
        }        
        return dp[n]= tribonacchi(n-1, dp) + tribonacchi(n-2, dp) + tribonacchi(n-3, dp);         
    }
    public static void main(String[] args) {
        int n = 20;
        int dp[] = new int[n+1];
        for(int i=0; i<n; i++) {
            System.out.print(tribonacchi(i, dp)+" ");
        }
        System.out.println();
    }
}
