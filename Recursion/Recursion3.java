package Recursion;

// print sum of the n natural numbers

public class Recursion3 {

    public static void printSum(int i, int n,int sum){// taking three variabl one is for 

      //increment, for conditon reching to n and for sum

      if(i == n){//first codition fro i to 1 - 1 to n

        sum +=i; //1st sum the value of i
        System.out.println(sum);//2nd print the value of sum
        return; //return valu as usual
      }

      sum +=i; //sum as the function

    printSum(i+1, n, sum);//increase valu of i at the time of calling function
    

    }

    public static void main(String[] args) {
        
        printSum(1, 5, 0); // input value


        
    }
    
}
