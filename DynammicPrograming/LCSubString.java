package DynammicPrograming;

public class LCSubString {
    // Longest Common Substring
    public static int longestCommonSubstring(String str1, String str2, int n, int m) {
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        // init not necessary
        for(int i=0; i<n+1; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<m+1; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abdge";

        System.out.println(longestCommonSubstring(str1, str2, str1.length(), str2.length()));
    }
}
