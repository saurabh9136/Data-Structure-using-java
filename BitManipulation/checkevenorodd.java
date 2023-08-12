package BitManipulation;

public interface checkevenorodd {

    public static void checkEvenOrOdd(int num){

        int bitMsk = 1;// creat a mask to perform operation
        if((num & bitMsk) == 0){ // compare n to 0000000001 

            // above formula give either 1 or 0

            System.out.println(" even");
        }else{

            System.out.println("odd");
        }
    }
    // to get the ith bit we use & operator
    
    public static int get_bit(int num, int i){

        int bitMask = 1<<i;

        if((num & bitMask) == 0){

            return 0;
        }
        else{
            return 1;
        }
    }

    // set ith bit using | or operator
    
    public static int set_Bit(int num, int i){

        int BitMask = 1<<i;

        return num | BitMask;
    }

    public static int clearithBit(int num, int i){

        int bitmask = 1<<i;
        return ~bitmask & num;
    }

    public static int updateithbit(int num, int i, int userbit){

     
        if(userbit ==0){

            return clearithBit(num, i);
        }
        else{

            return set_Bit(num, i);
        }


       
    }

    public static void main(String[] args) {
        
      //  checkEvenOrOdd(3);
       System.out.println(get_bit(5, 0)); 

       System.out.println(set_Bit(5,1)); 

       System.out.println(clearithBit(5, 2));

       System.out.println(updateithbit(2, 0, 1)); 
    }

       
}
