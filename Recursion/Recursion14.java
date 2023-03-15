package Recursion;

public class Recursion14 {
    //md of all 'x' to the end of string

    public static void shiftXTotheEnd(String str, int indx,String newStr, int count){
        
        if(indx == str.length()-1){

            for(int i=0; i<count; i++){

                newStr += 'x';
            }

            System.out.println(newStr);
            return;
        }
       
        char currentChar = str.charAt(indx);
        if(currentChar == 'x'){

            count++;

        shiftXTotheEnd(str, indx+1, newStr, count);
        }else{
            newStr += currentChar;

            shiftXTotheEnd(str, indx=1, newStr, count);
        }
        

        
    }
    public static void main(String[] args) {
        
        String str = "hvgxjsxxxjxxj";
       
      
      
      shiftXTotheEnd(str, 0, "", 0);

     

        

    }
    
}
