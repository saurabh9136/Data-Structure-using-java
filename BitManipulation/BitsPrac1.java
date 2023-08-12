package BitManipulation;

public class BitsPrac1 {

    public static void main(String[] args) {
        
        //Write a program to find if a number is a power of 2 or not.

        int num = 16;

       int bitnask = num & num-1;
            
      if(bitnask == 0){

        System.out.println("numer i power of 2");
      }else{

        System.out.println("number is not a power of 2");
      }

    }
    
}
