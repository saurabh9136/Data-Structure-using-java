package Recursion;

public class tillingProblem {

/*tilling problem given a "2*n"floor and tile of size " 2 * 1", count the number ofways to tile
 the given board using the 2 * 1 tiles.
 (A tile can either a Vertically or Horizontally)*/

 // we take parameter only n because we need to calculate 2 * n
 
 public static int tilling(int n){

    if(n == 0 || n == 1){

        return 1;
    }
    // first choose the direction
    // vertically

    //int fnm1 = tilling(n-1); 
    // after choosing vert than the space rmaining is n minus 1

    // horizontally
    //int fnm2 = tilling(n-2);
    // after hori the 2 sapce is occupy then the remaining space is n - 2

    // calculate the total 

    return tilling(n-1) + tilling(n-2);
 }

 public static void main(String[] args) {
     
    int n = 4;

    System.out.println(tilling(n));
 }
    
}
