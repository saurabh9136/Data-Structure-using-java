package GreedyAlgorithm;
import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {
// ***using Integer because we need to sort in decresing order and it not work on primitive dataType******       
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;

        // creating arrayList whic store the notes use to pay amount
        ArrayList<Integer> list = new ArrayList<>();
        
        // now sort the array in decresing order bcs if we satrt from largest value tehn possibility is hight for optim
       Arrays.sort(coins, Comparator.reverseOrder());

       int countOfCoins = 0;
       for(int i=0; i<coins.length; i++) {
           if(coins[i] <= amount) {
               while(coins[i] <= amount) {
//******init while loop to take same note or coins multiple times *******
                  countOfCoins++; // increse nummber of counts
                  list.add(coins[i]); // add that coin in array list
                  amount -= coins[i]; // decrese that coin from amount and check until it become 0                 
               }
           }
       }

       System.out.println("total notes/coins are: "+countOfCoins);

       for(int i=0 ;i<list.size(); i++) {
           System.out.print(list.get(i)+"  ");
       }System.out.println();
    }
    
}
