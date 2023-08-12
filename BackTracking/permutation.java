package BackTracking;

public class permutation {

    public static void printPermutation(String str, String ans){
// base caase
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){ 

            // first get the ith character of string
            char curr = str.charAt(i);
            // now if the character was selected delete that character from string 
// new str = let i = b  a + cd --  b removed from string           
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        
        String str = "abc";
        printPermutation(str, "");
    }
    
}
