package DynammicPrograming;

public class CountingBST {
    public static int countBst(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=n; i++) {
            for(int j=0; j<i; j++) {
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left * right;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(countBst(4));
    }
    
}
