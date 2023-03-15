package Stacks;
import java.util.*;
public class ValidParenthese {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

         for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            // push opening parantheses
            if(ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            }
            // let )))))) there is only closing brackets then stack there is not closing bracket for comparison
            if(s.isEmpty()){
                return false;
            }
            // check for closing if making pair
            if( (s.peek() == '{' && ch == '}') 
               || (s.peek() == '[' && ch ==']')
               || (s.peek() == '(' && ch == ')') ) {
                  // if the above cond is true then and pair making the check for other level by poping

                s.pop();
            }
         }

         if(s.isEmpty()){
             return true; //by comparing all element now stack is empty so return true
         }else{
             return false; //means some elements are remaining
         }
    }public static void main(String[] args) {
        
        String str = "(])";
        System.out.println(isValid(str));
    }    
    
}
