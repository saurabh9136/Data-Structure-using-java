package ArrayLists;
import java.util.*;

public class contMostWaterOpt {

    public static int storeWater(ArrayList<Integer> container ) {

        int maxWater = 0;
        int lp = 0; // left pointer
        int rp = container.size()-1; // right pointer

        while(lp < rp){
            // cal the water 
            int ht = Math.min(container.get(lp), container.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update the pointers value
            if(container.get(lp) < container.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);

        System.out.println(storeWater(container));
    }
    
}
