package arrays;

import java.util.Scanner;

public class inputName {

    public static void main(String[] args) {

        String name[] = new String[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            name[i] = sc.nextLine();

        }
        for (int i = 0; i < 2; i++) {

            System.out.print(name[i]);
        }

        sc.close();

    }

}
