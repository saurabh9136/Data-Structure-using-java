package DynammicPrograming;


public class Fibonnacchi {
    //Memorization method
    public static int fib(int n, int dp[]) {

        if(n==0 || n==1) {
            return n;
        }

        if(dp[n] != 0) { // if not zero means already calculated
            return dp[n];
        }

        dp[n] = fib(n-1, dp) + fib(n-2, dp); // by using this step we store the values into dp array

        return dp[n];
    }

    // Tbaulation (Bottom - up)
    public static int fibTabulation(int n, int dp[]) {

        dp[1] = 1;// 0 is already initalize
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    } 

    public static void main(String[] args) {
        
        int n=5;
        int dp[] = new int[n+1];

        for(int i=0; i<dp.length; i++) {
            System.out.print(fibTabulation(i, dp)+" ");
        }
    }
    
}
