package Recursion;

public class RecdecreasingOrd {

    public static void decreasingOrder(int num){

        if(num == 1){
           System.out.println(num+" ");
            return ;
        }

        System.out.print(num+" ");
        decreasingOrder(num + 1);
        
    }
    public static void printInc(int num){

       
        if(num == 1){

            System.out.print(num+" ");
            return;
        }       
        
        printInc(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args){


        int num = 9;
        printInc(num);
    }
    
}
