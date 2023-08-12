package BackTracking;

public class subSet {

    public static void findSubSet(String str, int i, String ans){
        // base case
        if(i == str.length()){            
            if(ans.length() == 0){
              System.out.println("null");
            }else{
                System.out.println(ans);
                return;
            }
            
        }

        // recursion
        // if choice is yes then
        findSubSet(str, i+1, ans+str.charAt(i));
        // else choice is no / backtracking
        findSubSet(str, i+1, ans);
       

    }

    public static void main(String[] args) {
        
        String str = "abc";
        findSubSet(str, 0, "");
    }
    
}
