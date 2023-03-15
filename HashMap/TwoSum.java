package HashMap;
import java.util.*;

public class TwoSum {    

    public static void main(String[] args) {
        
    int arr[] = {2, 7, 11, 15};
    int target = 9;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    int sum = 0 ;
    for(int i=0; i<arr.length; i++) {
        sum += arr[i];
        map.put(sum, arr[i]);

        if(sum == target) {
            int idx = map.remove(sum);
            System.out.println(idx);
        }
    }
    System.out.println(map);

    }


    
}
