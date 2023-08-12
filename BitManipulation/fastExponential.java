package BitManipulation;

public class fastExponential {

    public static int fastExpo(int n, int p){

        // declare a variable 

        int ans = 1;

        while(n > 0){

            if((n & 1) != 0 ){// get lsb as 1 tehn only we move forward

               ans = ans * p;

            } 

            p = p * p;

            n = n>>1;

        }

        return ans;
    }

    public static void main(String args[]){

        System.out.println(fastExpo(3, 3));
    }
    
}
