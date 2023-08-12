package BitManipulation;

import java.util.Scanner;

public class BitMskprac2 {

    public static void main(String[] args) {
        
        //Write a program to toggle a bit a position = “pos” in a number “n”.

        Scanner sc = new Scanner(System.in);
       
        int num =5;//0101
        int pos =1;

        int usrInpu = sc.nextInt();

        int bitMask = 1<<pos;

        if(usrInpu == 0){

            int newNumber = ~ bitMask & num ;

            System.out.println(newNumber);

        }else{

            int newNumber1 = num | bitMask;

            System.out.println(newNumber1);
        }

        sc.close();
    }
    
}
