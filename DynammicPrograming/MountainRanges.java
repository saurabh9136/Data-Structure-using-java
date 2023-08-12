package DynammicPrograming;

public class MountainRanges {

    public static int mountainsRanges(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n+1; i++) {
            // i-> ways for mountain => ci
            for(int j=0; j<i; j++) {
                int inside = dp[j];
                int outside = dp[i-j-1];

                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;

        System.out.println(mountainsRanges(n))  ;
    }
    
}
