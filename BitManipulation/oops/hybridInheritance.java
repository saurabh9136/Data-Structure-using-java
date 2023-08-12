package BitManipulation.oops;

public class hybridInheritance{

    public static void main(String[] args) {
        
        
    }

}

class Animal{

    String color;
    void breath(){

        System.out.println("breathing");
    }

    void eat(){

        System.out.println("eating food");
    }

}

class Fish extends Animal{

    int fin;
    void swim(){

        System.out.println("swims under the wate");
    }
  
}

class tuna extends Fish{

    String dish;
    void breed(){

        System.out.println("comes in ocen");
    }
}

class sharks extends Fish{

    int swimspeed;
    void dangerous(){

        System.out.println("sharks are dangerous");
    }
}
class Bird extends Animal{

    String breed;
    void fly(){

        System.out.println("flies in the sky");
    }
}

class Peacock extends Bird{

    String quality;

    void type(){

        System.out.println("it is a national bird");
    }
} 
class mammel extends Animal{

    int walk;
    void walks(){

    }
}
