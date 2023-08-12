package BackTracking;

public class gridWays {

    public static int countGridWays(int i, int j, int n, int m){

        if(i == n-1 && j == m-1){
            return 1;
        }else if( i == n || j == m){

            return 0;
        }

        // to traver in down
        int w1 =countGridWays(i+1, j, n, m);
        // to traverse in right
        int w2 =countGridWays(i, j+1, n, m);

        // the formula of count ways is w1 + w2
        return w1 + w2;
    }
    public static void main(String[] args) {
        
        int n=3, m=3;
        System.out.println(countGridWays(0, 0, n, m));

    }
    
}
