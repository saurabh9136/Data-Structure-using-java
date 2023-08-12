package BitManipulation;

public class Questionofbit {

    // What is the value of x^x for any valueof x?

    public static int getXvalue(int x){

        // not if the value of both operand is same it returns the 0 

        int bitmask = x ^ x;

        return bitmask;
    }

    // swap two number withoutUsing a third variable

    public static void SwapToBits(int a, int b){

        System.out.println("value of a and b before swap is "+a+","+b);

        a = a ^ b;// formula for swapping two numbers
        b = a ^ b;
        a = a ^ b;

        System.out.println("value of a and b after swap is "+a+","+b);
    }

    // add 1 to an integer using bitManipulation

    public static int addInteger(int num){
        
       num = num << 1;

       int bitmask = 1<<0;

       return num | bitmask;
      

    }

    // covert upper case into lower case

    

    public static void main(String[] args) {

        System.out.println(getXvalue(5));

        SwapToBits(5, 10);

        System.out.println(addInteger(2));

        int x = 6;

        System.out.println(x+" ndc"+1+"is" +-~x);

      
        
    }
    
}
