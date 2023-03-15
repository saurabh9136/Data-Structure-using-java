package Recursion;

public class RecPrintFact {

    public static int printFact(int n){
        if(n==0){

            return 1;
        }
        int fn = n * printFact(n-1);
        return fn;
    }

    public static void main(String[] args){

        int n = 5;

        System.out.println(printFact(n));
    }
    
}
