package DSA_algorithms;

public class BuyAndSellStock {

    public static int Buy_and_Sell_stocks(int price[]){

        int Maxprofit = 0; // to calculate the mxaimum prift
        int BuyPrice = Integer.MAX_VALUE;// initalize with +infi

        for(int i=0; i<price.length; i++){ // loop from 0 to n

            if(BuyPrice  < price[i]){ 

                int profit = price[i] - BuyPrice; // calculate profit

                Maxprofit= Math.max(Maxprofit, profit); // calcukate maximum profit


            }else{
 // if selling price- price[i] is less than buying price then we have to vhange the value of
 // buying price into selling price because we need to get the samllest value in the array
 // so if we change price he we get the profit               

                BuyPrice = price[i];
            }
        }

        return Maxprofit;
    }

    public static void main(String[] args) {
        
        int price[] = {7, 1, 5, 3, 6, 4};

        System.out.println(Buy_and_Sell_stocks(price));
    }
    
}
