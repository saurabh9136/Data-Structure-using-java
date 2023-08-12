package BitManipulation;

public class clrBit {

    public static void main(String[] args) {

         //Clear 1 bit (pos = 2) of a number n. (0101)
        
        int num = 5;
        int pos = 1;

        int bitMask = 1<<pos;//create bit mask

        int newNumber = ~ bitMask & num;// fist use not then compare with orignal num

        System.out.println(newNumber);
    }
    
}
