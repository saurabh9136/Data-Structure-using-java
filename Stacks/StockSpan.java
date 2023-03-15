package Stacks;
import java.util.*;

public class StockSpan {
    public static void stockSpan(int stock[], int span[]) {
        // first create the stack
        Stack<Integer> s = new Stack<>();
        // as we know the first span is always one 
        span[0] = 1;// inti the span[0] = 1
        s.push(0); // first index number added in stack

        for(int i=1; i<stock.length; i++){// init with 1 bcause 0 already knows
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()]){
                s.pop(); // **(I)***
            }
            if(s.isEmpty()){
                span[i] = i+1; // when no prev is gretaer then currPrice
            }else{
                int prevHigh = s.peek(); // high lying on top because smallest are pop out in (I)
                span[i] = i-prevHigh;
            }
            s.push(i); // then pushh the value into stack
        }
    }
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100}; // value of stock each day
        int span[] = new int[stock.length]; // span of each days that's why size == Stock

        stockSpan(stock, span);
        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
    
}
