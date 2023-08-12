package GreedyAlgorithm;
import java.util.*;

public class ActivitySelection {
    
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] =   {2, 4, 6, 7, 9, 9};
        // note if end is not sorted to please yaad rakh sort kerna hoga
        // if its not sort check the unsortedActivitySelection code

        // inti count var
        int maxAct = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        // taking array list because size is not fixed
        // now as default action choose first element because its shortest time activity if end is sorted
       
        maxAct = 1;//we also init max as 1 
        arr.add(0);// add index number of activity in array liste
        int lastTime = end[0]; //to compare in next alggo

        for(int i=1; i<start.length; i++) {

            if(start[i] >= lastTime) {
                maxAct++;
                arr.add(i);
                lastTime = end[i];
            }
        }

        System.out.println("Activites are complete "+maxAct);

        // now print index of activities which should be printed
        for(int i=0; i<arr.size(); i++) {
            System.out.print("A"+arr.get(i)+" ");
        }
        System.out.println();


    }
}
