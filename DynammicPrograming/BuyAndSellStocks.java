package DynammicPrograming;

public class BuyAndSellStocks {
    public static int maxProfit(int stocks[], int fee) {
       
        int profit = Integer.MAX_VALUE;      

        for(int i=0; i<stocks.length; i++) { 
            int buy = -1;            
            for(int j=i+1; j<stocks.length; j++) {               
                if(stocks[i] > stocks[j]) {
                    buy = stocks[j];                                    
                }
                if(stocks[i] < stocks[j] && buy != -1) {
                    profit =  stocks[j] - buy - fee;                  
                }
            }
            
        }
       return profit;   
    }
    public static void main(String[] args) {
        int stocks[] = {6, 1, 7, 2, 8, 4};
        System.out.println(maxProfit(stocks, 2));
    }
}
