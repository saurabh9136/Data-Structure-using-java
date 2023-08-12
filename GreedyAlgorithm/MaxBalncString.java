package GreedyAlgorithm;

public class MaxBalncString {

    public static int balanlcedString(String str, int n) {

        // base case if there is not string
        if(n == 0) 
        return 0;
        

        int L = 0;//pointer for L
        int R = 0; // pointer for R
        int ans = 0;

        for(int i=0; i<n; i++) {

            if(str.charAt(i) == 'R') {
                R++; // increase L's value
            } else if(str.charAt(i) == 'L') {
                L++; // Increase R's value
            }

            if(R==L) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        String str = "LRRRRLLRLLRL";
         
        int n = str.length(); 

        System.out.println(balanlcedString(str, n));
    }
    
}
