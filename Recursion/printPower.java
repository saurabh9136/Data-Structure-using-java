package Recursion;

public class printPower {

    public static int powerOfN(int x,int n){

      if(n == 0){

        return 1;
      }

      return  x * powerOfN(x, n-1);

    }


    

    public static void main(String[] args) {
        
        int x = 2;
        int n = 10;

        System.out.println(powerOfN(x, n));
        
        int pow = 1;

        for(int i=1; i<=n; i++){

            pow = x * n-i;
        }

        System.out.println(pow);
    }
    
}
