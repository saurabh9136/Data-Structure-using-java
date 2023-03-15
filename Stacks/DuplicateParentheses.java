package Stacks;
import java.util.*;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            // now we know the question is valid expression so we need to check from closing directly
            // closing
            if(ch == ')') { // because there is only one type of parenthese
               
                // now perform operation's pairing or poping
                int count = 0; // count the attempts whle pair found
                while(s.peek() != '('){// we use pop also to use direct operation to opt code
                    s.pop(); // pop until cond rexh
                    count++;
                }
                if(count < 1) {
                    return true;
                }else {
                    s.pop(); //pop the pair to call for next operation
                }

                
            }// opening 
            else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
         
        String str = "(a+b)";
        String str2 = "(((( a + (b+c) + (c+a) ))))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
    
}
