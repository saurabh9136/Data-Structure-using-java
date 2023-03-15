package HashMap;
import java.util.*;

public class UnionAndIntersec {
    public static void main(String[] args) {

        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4, 9};
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        // Union
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union nums = "+set.size()+" Values are:"+set);

        //Intersection
        // we use same set to get the value
        set.clear();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                set1.add(arr2[i]);
                set.remove(arr2[i]);
                
            }
        }

        System.out.println("Intersection nums ="+count+" Values are:"+set1);
    }
}
