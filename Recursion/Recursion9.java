package Recursion;

public class Recursion9{

    // tower of hanoi

public static void towerOfhanoi(int n,String src,String help, String Dest){
    if(n ==1){
        System.out.println("transfer disk "+n+" from "+src+" to "+Dest);
        return;
    }
    towerOfhanoi(n-1, src, Dest, help);
    System.out.println("transfer disk "+n+" from "+src+" to"+Dest);
    towerOfhanoi(n-1, help, src, Dest);

    
}
public static void main(String[] args) {

    int n=3;

    towerOfhanoi(n, "source", "helper","Destination");
    
}
}