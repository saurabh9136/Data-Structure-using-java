package BitManipulation;

public class getBit {

    //get 3 bit (pos = 2) of a number n. (0101)
    public static void main(String[] args) {
        
        int num = 5;
        int pos = 1;
        int bm = 1<<pos;

        if((bm & num)==0){
            System.out.println("value is zero");
        }else{

            System.out.println("value was one");
        }
    }
    
}
