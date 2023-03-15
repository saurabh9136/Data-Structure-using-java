package ArrayLists;
import java.util.*;

public class pairSum {

    public static void calSum(ArrayList<Integer> num, int target) {
       for(int i=0; i<num.size(); i++){
           for(int j=i+1; j<num.size(); j++){

               if(num.get(i) + num.get(j) == target){
                   System.out.println("sum of index are: "+i+","+j);

               }
           }
       }
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        calSum(num, 5);
        
    }
    
}
