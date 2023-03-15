package Recursion;

public class friendsPairing {

    public static int calFriendspairing(int n){

       // base case
       
       if(n == 1|| n == 2){

        return n;
       }    
       
    //    // first select choice single
    //    int fnm1 = calFriendspairing(n-1);

    //    // second pair so remaining peoples are n -2
    //    int fnm2 = calFriendspairing(n-2);
    //    int ways = (n-1) * fnm2;

    //    int totalWays = fnm1 + ways;

       return calFriendspairing(n-1) + (n-1) * calFriendspairing(n-2);
    }
    public static void main(String[] args) {
        
        System.out.println(calFriendspairing(3));
      
    }
}
