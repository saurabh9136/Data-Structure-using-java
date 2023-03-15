package Recursion;

public class Recursion12{
    public static int first =-1;
    public static int last =-1;

    public static void PrintOccurance(String str, int indx, char c) {
        
        if(indx == str.length()){

            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentCahr=str.charAt(indx);

        if(currentCahr == c){

             if(first ==-1){

                first = indx;
             }else{

                last=indx;
             }

        }
        
        PrintOccurance(str, indx+1, c);
    }
    public static void main(String[] args) {
        
        String str = "baajssaaakaaka";

        PrintOccurance(str, 0, 'a');

    

    }
}