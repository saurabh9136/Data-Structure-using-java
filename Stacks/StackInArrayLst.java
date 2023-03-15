package Stacks;
import java.util.ArrayList;

public class StackInArrayLst {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
       
        // check for if list or stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        // push
        public static void push(int data) {
            list.add(data);
        }
        // pop
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
           int top = list.get(list.size()-1);
           list.remove(list.size()-1); //Bexause last index in Arraylist is top in stack
           return top;
        }
        //peek
        public static int peek(){

            return list.get(list.size()-1); //Bexause last index in Arraylist is top in stack
        }


    }
    public static void main(String[] args) {
        
        /*Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

       // System.out.println(s.peek());
       /*/
    }
}
