package Recursion;



public class Recursion7 {

    // print x^n (stack height = n )

    public static int CalPower(int x, int n){
       
        if(n == 0){//because the poer of 2^0 is 1
            return 1;
        }
        if(x == 0){ // because power of 0 is 0

            return 0;
        }
     
        

        int power = x*CalPower(x, n-1); // formula x^n = x*x+n-1

        return power;
    }

    public static void main(String[] args) {
        
        int x = 2;
        int n=5;

        int ans = CalPower(x, n);

        System.out.println(ans);
    }
    
}
