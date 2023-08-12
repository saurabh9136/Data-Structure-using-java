package BitManipulation;

import java.util.*;

public class decToBin {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a decimal number");
        int decimal = sc.nextInt();

        int rem =0;


        while(decimal > 0){

            rem = rem + decimal%2;

          decimal = decimal / 2;


        }

        System.out.println("Binary number of equivalent of decimal is:"+rem);

        
        sc.close();

    }
    
}
