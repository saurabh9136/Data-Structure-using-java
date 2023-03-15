package arrays;

import java.util.Scanner;

public class yahoo{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("enter a number of rows and coumns");

            int rows = scn.nextInt();
            int cols = scn.nextInt();

            int[][] matrix = new int[rows][cols];

         for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){

                matrix[i][j]=scn.nextInt();
            }
         }

         int left = 0;
         int  right = cols-1;
         int top =0;
         int bottom = rows-1;

         System.out.println("the spiral order Matrix are: ");

         while(top<=bottom && left<=right){

          for(int i=left; i<=right; i++){

            System.out.print(matrix[top][i]);
          }
          top++;

          for(int i=top; i<=bottom; i++){

            System.out.print(matrix[i][right]);
          }
          right--;

    


          for(int i=right; i>=left; i--){

            System.out.print(matrix[bottom][i]);
          }
          bottom--;
        

         

          for(int i=bottom; i>=top; i--){

            System.out.print(matrix[i][left]);
          }
          left++;   
          

         }

        scn.close();
    }
}