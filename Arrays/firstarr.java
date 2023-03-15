package arrays;

import java.util.Scanner;

public class firstarr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int marks[] = new int[size];

        for (int i = 0; i < size; i++) {

            marks[i] = sc.nextInt();// taking input from user
        }

        for (int i = 0; i < size; i++) {

            System.out.println(marks[i]);// printing value of array
        }
        sc.close();
    }
}
