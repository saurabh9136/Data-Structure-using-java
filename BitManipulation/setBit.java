package BitManipulation;

public class setBit {

    public static void main(String[] args) {

        //set 3 bit (pos = 2) of a number n. (0101)
        
        int num = 5;
        int pos = 1;

        int bitMask = 1<<pos;

        int newNumber = num | bitMask ;

        System.out.println(newNumber);
    }
    
}
