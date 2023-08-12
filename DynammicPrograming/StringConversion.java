package DynammicPrograming;

public class StringConversion {

    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    static int ans = 0;
  

    public static void stringConv(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        ans = lcs(str1, str2);

       int ins = m - ans;
        int del = n - ans;

      System.out.println("deleter operation are: "+del);
    System.out.println("insert operations are: "+ins);


    }
    public static void main(String[] args) {
        
        String w1 = "abcdef";
        String w2 = "aceg";
        stringConv(w1, w2);
     
        
    }
    
}
