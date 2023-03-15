package Stacks;
import java.util.*;
public class AddInBottom {
    
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // base Case when stack was empty and add(push) the data into Stack then add
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); // first remove the data
        pushAtBottom(s, data); // call for next level
        s.push(top); // now add all removed data again in stack
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
