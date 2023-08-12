package GreedyAlgorithm;
import java.util.*;

public class UnsortActSel {
    public static void main(String[] args) {
        
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] =   {2, 4, 6, 7, 9, 9};
     
        int Activite[][] = new int[start.length][3];//3=idx,start,end

        for(int i=0; i<start.length; i++) {
            Activite[i][0] = i;
            Activite[i][1] = start[i];
            Activite[i][2] = end[i];
        }
        // sorting ending index using below algo
        Arrays.sort(Activite, Comparator.comparingDouble(o->o[2]));
     
        int maxAct = 1;
        ArrayList<Integer> arr = new ArrayList<>();           
       
        arr.add(Activite[0][0]);// add index number of activity in array liste
        int lastTime =Activite[0][2]; //to compare in next alggo
 
        for(int i=1; i<start.length; i++) {

            if(Activite[i][1]>= lastTime) {
                maxAct++;
                arr.add(Activite[i][0]);
                lastTime = Activite[i][2];
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
