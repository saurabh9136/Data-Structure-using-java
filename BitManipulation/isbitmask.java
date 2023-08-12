package BitManipulation;

public class isbitmask {

    // chceck if a number is a prime or not

    public static int isPrime(int num){

        int bitmask =  num & (num-1);

        if( bitmask == 0){

            System.out.println("Entered Number is a prime Number");
        }else{

            System.out.println("not a prime Number");
        }
        return bitmask;
    }

    public static void main(String[] args){

        System.out.println(isPrime(30));
    }
    
}
