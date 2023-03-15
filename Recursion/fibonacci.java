package Recursion;

public class fibonacci {

    public static int fib(int n){
        
        if(n==0 || n==1){

            return n;
        }
        int nm1 = fib(n-1);
        int nm2 = fib(n-2);

        int fibn = nm1 + nm2;

        return fibn;

    }

    public static void main(String[] args) {
       
        int n =5000;

        for(int i=0; i<n; i++){

            System.out.print(fib(i)+" ");
        }
       
    }
    
}
