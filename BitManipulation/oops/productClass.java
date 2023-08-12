package BitManipulation.oops;

import java.util.Scanner;


public class productClass {

public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
   
    Complex cal = new Complex();

    cal.a = sc.nextInt();
    cal.b = sc.nextInt();

    System.out.println("sum of a and b is :"+cal.calsum());
    System.out.println("diffrence of a and b is :"+cal.diffren());
    System.out.println("product of a and b is :"+cal.product());

    sc.close();
}    
    
}
class Complex{

    int a;
    int b;
   
    int calsum(){
        return a+b;
    }

    int diffren(){

        return a-b;
    }
    int product(){
        return a*b;
    }
}