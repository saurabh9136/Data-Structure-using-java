package BitManipulation;

public class bitpractice {

    public static void main(String[] args) {
        
    int[] array = {2,1,2,2,1, 1,3};

    int ans = 0;

    for(int i =0 ; i<array.length; i++){

        ans = ans ^ array[i];

       
    }

    System.out.println(ans);
    }
      

    }
    

