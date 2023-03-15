package Recursion;

public class Rcursion6 {

    // print the fibonacci series till nth term by increment ith term   

    public static  void printFibonnacchi(int a,int b,int i,int n){


        if(i == n){

          return;
        }
        int c = a+b;
        System.out.println(c);

         printFibonnacchi(b, c, i+1, n);
    }

    public static void main(String[] args) {
        int a =0;
        int b =1;
        int i=0;
        int n=8;

        System.out.println(a);
        System.out.println(b);

       printFibonnacchi(a, b, i+1, n-2);

     
    }
}
    

