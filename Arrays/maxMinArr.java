package arrays;

import java.util.Scanner;

public class maxMinArr {

    public static void main(String[] args) {

        // Find the maximum & minimum number in an array of integers

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a size of array");
        int size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {

            number[i] = sc.nextInt();

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {

            if (number[i] > max) {

                max = number[i];
            }

            if (number[i] < min) {

                min = number[i];
            }

        }

        System.out.println("maximum value is: " + max);
        System.out.println("minimum value is: " + min);

        sc.close();

    }
}
