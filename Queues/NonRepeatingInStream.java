package Queues;
import java.util.*;

public class NonRepeatingInStream {

    public static void nonRepeatingString(String str) {

        // first create a array which store freq
        int freq[] = new int[26]; //26 character of alphabet
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            // get the ith char
            char ch = str.charAt(i);

            q.add(ch);
            freq[ch - 'a']++;//ch-a retuen the integer value which store the alphabet index

        while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) { // if queue's element values freq (a) comes more then 1 time
           
             q.remove();
                   
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }           
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        String str = "aabccxb";
        nonRepeatingString(str);
    }
    
}
