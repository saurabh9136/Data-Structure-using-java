package Recursion;

public class Recursion11 {


    public static void printRev(String str,int ind){

      if(ind == 0){

       System.out.println(str.charAt(ind));
       return;
      }
     
      System.out.print(str.charAt(ind));
      printRev(str, ind-1);
    }
    public static void main(String[] args) {
      
      String str  = "abcd";

      printRev(str, str.length()-1);

    }
    
}
