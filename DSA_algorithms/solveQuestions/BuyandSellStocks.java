package DSA_algorithms.solveQuestions;

public class BuyandSellStocks {

    /*You  are  given  an  array prices where prices[i] is  the  price  of  
    a  given  stock  on  the ith day.Return the maximum profit you can
     achieve from this transaction. If you cannot achieve any profit, return 0.*/

    public static int BandS_Stocks(int prices[]){

        int MaxProfit = 0;
        int BuyingPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
 
        if(BuyingPrice < prices[i]){

            int profit = prices[i] - BuyingPrice;

          MaxProfit = Math.max(MaxProfit, profit);
        }else{

            BuyingPrice = prices[i];
        }

        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        
        int prices[] = {7, 6, 4,  3, 1 };

        System.out.println(BandS_Stocks(prices));
        
    }
    
}
