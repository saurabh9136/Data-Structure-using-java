package BitManipulation;

public class clearLastithbits {

    // writing a code to clear all the bits after ith element 

 public static int clearibits(int num, int i){

    // we know that if we convert any number to 1 to 0 we use & opertaor

    // so we take ~0 << bit because it converts all 0 into 1

    int bitmask = (~0)<<i;
    return bitmask & num;
 }

 public static void main(String[] args){

    System.out.println(clearibits(15,2));
 }

    
}
