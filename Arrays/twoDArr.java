package arrays;

import java.util.*;

public class twoDArr {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter a number of rows and columns");

        int rows = in.nextInt();

        int col = in.nextInt();

        int[][] matrix = new int[rows][col];

        for (int i = 0; i < rows; i++) {// for outteer loop (row)

            for (int j = 0; j < col; j++) {// for inner loop (column)

                matrix[i][j] = in.nextInt();// for taking inputs for cells
            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        in.close();

    }

}
