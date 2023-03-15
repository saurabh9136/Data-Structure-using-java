package LinkedList;

public class abc {

    public static String ifPrefix(String str[], String ans){
    for(int i=0; i<str.length; i++){
        for(int j=i+1; j<str.length; j++){
            if(str[i] == str[j]){
                ans = str[i];
            }
            else{
                System.out.println("no result found");
            }
        }

    }

    return ans;

    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(ifPrefix(str, ""));
    }
    
}
