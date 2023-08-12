package DSA_algorithms.solveQuestions;

public class trackRepeatNum {

/*Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinc*/
       
 public static Boolean chckRepeatNum(int num[]){
     
    boolean cond = false;
    for(int i=0; i<num.length; i++){

        for(int j=i+1; j<num.length; j++){

            if(num[i] == num[j]){

                cond = true;
        }
        
        }
    }
    return cond;
 }

 public static void main(String[] args) {
     
    int num[]= {1, 1, 1, 3, 3, 3, 4, 3, 2, 4, 2};

    System.out.println(chckRepeatNum(num));
 }

    
}
