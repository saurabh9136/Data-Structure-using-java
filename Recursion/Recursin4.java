package Recursion;
// print factorial of number till n using recursion

public class Recursin4 {

    public static int printFact(int n){// return type int because we cal thr fact

        if(n == 1 || n == 0){ //because these both values are already given

            return 1; // so we return 1 for these both numbers in factorial
        }
        
       int factn_1 = printFact(n-1); //form: n*(n-1) first storing value of n-1

       int factn = n*factn_1;  // formula for getting factorial of n

       return factn; // return fact because this is int function
    }

    public static void main(String[] args) {
        
        int n=5;

       int ans =  printFact(n); //calling function and save value in another variable

       System.out.println(ans);
       
    }
    
}
