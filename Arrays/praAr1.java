package arrays;

import java.util.Scanner;

public class praAr1 {

    public static void main(String[] args) {
        /* take a matrix as a input from user.search for the given number X
        and print the indices which it occure*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numbers of rows and columns:");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] Matrix = new int[rows][cols];

        for(int i=0; i<rows; i++){


            for(int j=0; j<cols; j++){

                Matrix[i][j]=sc.nextInt();
            }
        }

        int x = sc.nextInt(); // number which have o find the indices

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){

                if(Matrix[i][j] == x){

                    System.out.println("x founded at("+ i +" , "+j + ")");


                }
            }
        }


        sc.close();
    }
    
}
