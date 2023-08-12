package Heaps;
import java.util.*;

public class InsertInHeaps {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();
          
        public  void add(int data) { //O(logN)
            arr.add(data);//add at last index

            // now check if parent value greater then child value

            int childX = arr.size()-1;  //child index
            int parent = (childX-1)/2;  //parent index

            while(arr.get(childX) > arr.get(parent)) {  // if child is smaller then parent
                //swAP

                int temp = arr.get(childX);
                arr.set(childX, arr.get(parent));
                arr.set(parent, temp);
            }

        }

        public int peek() {

            return arr.get(0);
        }

        private void heapiFy(int idx) {

            // calculate left and right index
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minVal = idx;

            // stpe 1 checkk the value of all 3 node
            // the condition when node is leaf then the min value return bigger numb from size of array
 
            if(left < arr.size() &&  arr.get(minVal) < arr.get(left)) {
                //get min
                minVal = left;
            }
            
            if(right < arr.size() &&  arr.get(minVal) < arr.get(right)) {
                //get min
                minVal = right;
            }

            //after getting min value if number is same then nothing to do or else
            // now swap the value if its unbalanced
            if(minVal != idx ) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minVal));
                arr.set(minVal, temp);

                // now check again and again until all nodes comes at same pos we use rec
                heapiFy(minVal);
            }
         
        }

        public int remove() {
            int data = arr.get(0); //root value
            // step 1 swap last index with first index
            int temp = arr.get(0); //first indx
            arr.set(0, arr.get(arr.size()-1)); //last indx at first
            arr.set(arr.size()-1, temp);

            //step 2 delete last node
            arr.remove(arr.size()-1);

            //step 3 fix the Heap
            heapiFy(0); //root
            
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        
        Heap h = new Heap();//object of class

        h.add(1);
        h.add(3);
        h.add(5);
        h.add(2);
        h.add(4);

        while(!h.isEmpty()) {
            System.out.print(h.peek()+" ");
            h.remove();
        }
        System.out.println();

    }
    
}
