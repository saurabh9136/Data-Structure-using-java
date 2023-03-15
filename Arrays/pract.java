package arrays;

import java.util.Scanner;

public class pract {

    public static void main(String[] args) {

        // take an array as input from the user. search for the gien number x and print
        // the
        // index at which it occurs

        Scanner sc = new Scanner(System.in);

        int prac[] = new int[4];

        for (int i = 0; i < 4; i++) {

            System.out.println("enter a value for array ");
            prac[i] = sc.nextInt();

        }
        int n = sc.nextInt();
        for (int i = 0; i < prac.length; i++) {

            if (prac[i] == n) {

                System.out.println(" founded at n : " + i);
            }
        }

        sc.close();

    }

}
