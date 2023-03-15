package ArrayLists;
import java.util.*;

public class containerWithMostWater {

    public static int mostWater(ArrayList<Integer> container){

        int maxWater = 0;
        for(int i=0; i<container.size(); i++){
            for(int j=i+1; j<container.size(); j++){
                int height = Math.min(container.get(i), container.get(j));
                // always remember to caluculate the index by minus the last indx then first
                int width = j-i;
                int currWater = height * width;
                maxWater = Math.max(currWater, maxWater);
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
        
       System.out.println(mostWater(container));

    }    
}
