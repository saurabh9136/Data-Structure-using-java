package BitManipulation.oops;

public class polymorpism {

    public static void main(String[] args) {
        // function overloading
        Calculator calc = new Calculator();

        System.out.println(calc.sum(5, 4));
        System.out.println(calc.sum(5.7f, 4.3f));
        System.out.println(calc.sum(5, 4,10));
        // function overloading

        Deer d = new Deer();
        d.eat(); 

    }
    
}

//when we have to acheive a same goal with using diffrent ways its calling polymorphis
// there are 2 types of polymorphism 
//1 is compile time polymorphism(static)
// it contains the method overloading below is exmaple

class Calculator{
// overloading happens when function has same name but diffrent parameters (below is eg.) 
int sum(int a, int b){

        return a+b;
    }
    float sum(float a,float b){

        return a+b;
    }

    int sum(int a, int b, int c){

        return a+b+c;
    }
}
//2nd is run time polymorphism
// mathod overriding its happens when base or derived class contains same functio but diiff
// defination

class Animal2{

    void eat(){

        System.out.println("eats everything");
    }
}

class Deer extends Animal2{

    void eat(){
// note at the time of calling eat function the below function is only call in
// function overridding        

        System.out.println("eats grass only");
    }
}