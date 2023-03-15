package ArrayLists;
import java.util.*;

public class toDArrayList {

    public static void main(String[] args) {
        // syntax for creating a two d array
        /* list1 = 1 2 3 4 5
           list2 = 2 4 6 8 10
           list3 = 3 6 9 12 15
           */
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        // now create individual arrayList and add them into the mainList
        ArrayList<Integer> list1 = new ArrayList<>();        
        
        ArrayList<Integer> list2 = new ArrayList<>();
        
        ArrayList<Integer> list3 = new ArrayList<>();
        
      // intitalize each list with given values

       for(int i=1; i<=5; i++){

        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
       }
       // now add this lists into main list
       mainList.add(list1);
       mainList.add(list2);
       mainList.add(list3);
       System.out.println(mainList);
        // now print the value of each element

        for(int i=0; i<mainList.size(); i++){
            // create a var which save the hole list
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0; j<currentList.size(); j++){
                System.out.print(currentList.get(j)+" ");  
            }
            System.out.println();
        }
    }    
}
