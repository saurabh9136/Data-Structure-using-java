package DynammicPrograming;
import java.util.*;

public class Lis {

    public static int lcs(int arr1[], int arr2[] ) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        // intitalize not necessary in java
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(arr1[i-1] == arr2[j-1]) {
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
    public static int lis(int arr1[]) {
        // 1st get the unique elements from array
        HashSet<Integer> set = new HashSet<>();
        // now add the value of arr1 in hashset
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]); // elements
        }
        // 2nd create a array of set size
        int arr2[] = new int[set.size()];

        //3rd store the unique value in arr2 
        int i=0; // iterator for below loop
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        // now all values are stored in random order but we need the array in ascending order
        Arrays.sort(arr2);

        return lcs(arr1, arr2);
    }

    public static void main(String[] args) {
        int arr[] = {50, 3,  10, 7, 50, 40, 80, 40};
        System.out.println(lis(arr));
    }
}
