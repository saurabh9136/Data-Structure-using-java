package BitManipulation.oops;

public class inheritace {

public static void main(String[] args) {
    
    // first create a object


    Fish1 shark = new Fish1();
   
    // note we are calling the function whichh is not declare in fish class
    shark.eat();
// below class is also example of single inheritance
}
    
}
// creating a base class also know as parent class
class Animal1{

    String color;

    void eat(){

        System.out.println("eats a food");
    }

    void breath(){

        System.out.println("brath on enviournment");
    }
// now create a derived class using below keyword
}
  class Fish1 extends Animal1{

    int fins;

    void swims(){
      
     System.out.println("swims in the wate");
    }
  }
