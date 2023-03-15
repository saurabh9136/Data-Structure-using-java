package Stacks;
import java.util.*;

public class reverseStrStack {

    public static String reverseString(String str) {
       Stack<Character> s = new Stack<>(); // take stack in Character
       int index = 0; // init a var which track the string

       while(index < str.length()){ // loop from ith to last index
           s.push(str.charAt(index)); // pushing the variable at every index
           index++;
       }

       // create a new var which store thevalue of stack data in reverse data
       StringBuilder result = new StringBuilder("");
       while(!s.isEmpty()){
           char curr = s.pop();
           result.append(curr);

       }

       return result.toString();// note the result is SB type then please sure to convert into String
    }

    public static void main(String[] args) {    
        String str = "helloworld";
        String reverse = reverseString(str);
        System.out.println(reverse);
    }
    
}
