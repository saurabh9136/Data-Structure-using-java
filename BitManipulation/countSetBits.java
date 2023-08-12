package BitManipulation;

public class countSetBits {

    // count a set bits

    public static int Count_set_bits(int num){
        int count = 0;
         
      while(num > 0){
        if( (num & 1) != 0){
            count ++;
        }

        num = num >> 1;
      }
      
       return count;
}
     
    public static void main(String[] args) {
        
        System.out.println(Count_set_bits(7));
    }
    
}
