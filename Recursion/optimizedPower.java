package Recursion;

public class optimizedPower {

    public static int optimiPowe(int a, int n){

        if(n == 0){

            return 1;
        }

        int halfPower = optimiPowe(a, n/2);

        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0){
          
            halfPowerSq = a * halfPowerSq;

        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        
        System.out.println(optimiPowe(2, 13));
    }
    
}
