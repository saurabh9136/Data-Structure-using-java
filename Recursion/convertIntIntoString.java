package Recursion;

public class convertIntIntoString {

    // first create the static string array which stores the number in word

    static String digit[] = {"Zero", "One", "Two", "Three", "Four", "Five", " Six", "Seven","Eight", "Nine"};
// now each value store at the index number of the array

    public static void convertint(int num){
//by decreasing the value of num / 10 if the value will zero then close the recursion
        if(num == 0){
            return;
        }
//kaam
     int lastDigit = num%10;
     // with last digit we can call the array as per index
    convertint(num/10);
    //using recursion because we did not use the loop here
    System.out.print(digit[lastDigit]+" ");
    //passing lastDigit as a index in array parameter
    }        

    public static void main(String[] args) {
        
        int num = 2411;

        convertint(num);
    }
    
}
