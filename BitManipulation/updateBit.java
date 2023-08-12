package BitManipulation;

import java.util.Scanner;

public class updateBit {

    public static void main(String[] args) {

        // update scenerio if you have to update value with 1 then use set

        Scanner sc = new Scanner(System.in);
        
        int num = 5; //0101
        int pos = 0;

         System.out.println("enter a number which you want to upadte in bits");
         int operation = sc.nextInt();

        int Bitmask = 1<<pos;

        if(operation == 1){
       

            int newNumber = Bitmask | num;

            System.out.println(newNumber);

        }else {  // update scenerio if you have to update value with 0 then use clear

            int newNumber1 = ~ Bitmask & num;
 
            System.out.println(newNumber1);

        }sc.close();    
    }
    
}
