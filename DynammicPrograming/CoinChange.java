package DynammicPrograming;

public class CoinChange {

    public static int conChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int [n+1][sum + 1];

        // init
        for(int i=0; i<n+1; i++) { //n = coins 
            dp[i][0] = 1; // if 0 the its know as one way
        }

        for(int j=1; j<sum+1; j++) { // not mandatory
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(coins[i-1] <= j) { // include
                dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j]; //include + exclude
                } else {   // exclude
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];

    }
    public static void main(String[] args) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;
        System.out.println(conChange(coins, sum));
    }
    
}
