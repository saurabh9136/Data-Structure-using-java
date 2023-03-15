package Stacks;
import java.util.*;
public class MaxAreaInHistogram {
    
    public static void calMaxArea(int height[]) {
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        int maxArea = 0;

        // calulate next smaller right
        Stack<Integer> s = new Stack<>();
        
        for(int i=height.length-1; i>=0; i--) {            
            while(!s.isEmpty() && height[s.peek()] >= height[i]) {

                    s.pop(); //pop till small finded
            }
            if(s.isEmpty()) {                
                nsr[i] = height.length;
            }else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // calculate the next smaller left
         s = new Stack<>(); // now stack will be emty

        for(int i=0; i < height.length; i++) {            
            while(!s.isEmpty() && height[s.peek()] >= height[i]) {

                    s.pop(); //pop till small finded
            }
            if(s.isEmpty()) {
                
                nsl[i] = -1;
            }else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // now calculate the area
        for(int i=0; i < height.length; i++) {
            int Height = height[i];
            int width = nsr[i] - nsl[i] - 1; //j-i-1
            int currArea = Height * width ; 
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max area In histogram is = " + maxArea);
    }

    public static void main(String[] args) {
        
        int h[] = {2, 1, 5, 6, 2, 3};
        calMaxArea(h);
    }
}
