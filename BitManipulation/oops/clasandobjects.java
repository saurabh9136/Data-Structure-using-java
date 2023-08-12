package BitManipulation.oops;

public class clasandobjects {

public static void main(String[] args) {

    // 1st create a object
    pen p1 = new pen(); // constructor

    // call color object using below syntax

    p1.setColor("black");
    // now print the color
    System.out.println("color of pen is:"+ p1.color);
    // call 2nd object 
    p1.setNipsize(6);
    System.out.println("size of thickness is:"+ p1.nip);
    
    // we can multiple times change the color and size of functions.

    //also we use below syntax to call fumctions

    p1.color = "yellow";
    System.out.println(p1.color);

}
    
}

class pen{

    // now wite attributes/properties

    String color = "blue"; // bydefault color
    int nip = 5; // by default size of nip

 // write a fumction without using access modifier

 // below function for setting a color
 void setColor(String newcolor){
      color = newcolor;
      
 }
 void setNipsize (int size){

    nip = size;
 }
 


}
