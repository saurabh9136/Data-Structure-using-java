package ArrayLists;
import java.util.*;

public class searchPairRotated {
    // search in sorted or  rotated array

    public static boolean searchpairSum(ArrayList<Integer> list, int target){
      
        // first calculate the breaking point (pivot)
        int n = list.size();
        int bp = -1; // intalize braking point
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                 bp = i;
                 break;
            }
        }
        // now intitalize Starting or ending index
       int  si = bp+1;
       int ei = bp;

       // now search from si to ei
       while(si != ei){
           if(list.get(si) + list.get(ei) == target){
               return true;
           }else if(list.get(si) + list.get(ei) < target){
               si = (si+1)%n;
           }else{
               ei = (n + ei -1) % n;
           }
       }
       return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(searchpairSum(list, 19));
    }
    
}
