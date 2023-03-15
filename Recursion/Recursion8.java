package Recursion;

public class Recursion8 {

    // prin x^n (stach height logn)shrink memory as you can

    public static int CalcPower(int x, int n) {
        if(n==0){// base case 1

            return 1;
        }
        if(x==0){  // base case 2
            return 0;
        }
        if(n%2 == 0){ // if the given power numberr is even

            int evnpower = CalcPower(x, n/2) * CalcPower(x, n/2);
            return evnpower;
        }else{// if the poer number number is odd

            int odpower = CalcPower(x, n/2) * CalcPower(x, n/2) *x;
            return odpower;
        }
    }
    public static void main(String[] args) {
        
        int x=2;
        int n=5;

        int ans = CalcPower(x, n);

        System.out.println(ans);
    }
    
}
