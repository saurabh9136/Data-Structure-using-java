package Stacks;
import java.util.*;
public class NextGreter {

    public static void main(String[] args) {
        int arr[] = {0, 4, 6, 1, 3, 2};
        Stack<Integer> s= new Stack<>();
        int nextgrt[] = new int[arr.length];

        // run a loop from arr.length-1 to 0
        for(int i=arr.length-1; i>=0; i--){

 // check if stack is empty or value in stock is smaller then curr the pop tat value until the value become greater
             while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ // check with index of stack which point to value in array
               s.pop();
             }

             if(s.isEmpty()){
                 nextgrt[i] = -1;
             }else{
                  nextgrt[i] = arr[s.peek()];
             }

             // store the value of ith ndex into stack
             s.push(i);
        }

        for(int i=0; i<nextgrt.length; i++){
            System.out.print(nextgrt[i]+" ");
        }
        System.out.println();
    }
    
}
