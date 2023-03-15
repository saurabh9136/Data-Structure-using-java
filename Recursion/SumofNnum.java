package Recursion;

public class SumofNnum {

    public static int calSum(int n){

        if(n==1){

           
            return n;
        }

        int sum = n + calSum(n-1);
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.println(calSum(9));
    }
}
