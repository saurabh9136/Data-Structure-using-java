package DynammicPrograming;


public class CatalanNumbers {
    // recursion
    public static int catalanNum(int n) {
        if(n == 0 || n == 1) { // base case
            return 1;
        }
        int ans = 0;
        for(int i=0; i<=n-1; i++) {
            ans += catalanNum(i) * catalanNum(n-i-1);
        }
        return ans;
    }
    // memoization
    public static int catalanNumMemo(int n, int dp[] ){
      
        if(n == 0 || n == 1) { // base case
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i=0; i<=n-1; i++) {
           ans += catalanNumMemo(i, dp) * catalanNumMemo(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    // tabulation

    public static int catalanTab(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            for(int j=0; j<i; j++) {
               dp[i] += dp[j] * dp[i-j-1]; // cj = ci-cj-1
            }
        }
        return dp[n];
    }
 
    public static void main(String[] args) {
        // int n=5;
        // int dp[] = new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(catalanNumMemo(n, dp))

        System.out.println(catalanTab(5));
    }
    
}
