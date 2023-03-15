package Recursion;

public class lengthOfStr {

    public static int lengthStr(String Str){

        //base case
        if(Str.length() == 0){
          return 0;          
    }
    // now use substring method
    return lengthStr(Str.substring(1))+1;
// by using substring we can call the index num of String then we use the +1 recursion to
//calculate the length    

}

    public static void main(String[] args) {
        
        String Str = "saurabh";
        System.out.println(lengthStr(Str)); 
    }
    
}
