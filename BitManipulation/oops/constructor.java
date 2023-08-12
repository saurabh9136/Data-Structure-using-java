package BitManipulation.oops;

public class constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        //initalisation
        s1.roll= 1223;
        s1.name = "saurabh";
        s1.pass = "abcg";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 88;

        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.pass);

        // shallow copy constructor

        Student s2 = new Student(s1);

        s2.pass = "xyz";
        s1.marks[2] = 99;

        // printing marks value using loop

        for(int i=0; i<3; i++){

            System.out.println(s2.marks[i]);
        }
    }
    
}

class Student{
  
    int roll;
    String name;
    String pass;
    int[] marks = new int[3];

     // creating construcor
//not cons is always same name as the class with no return type

// there are three types of constructor 1 non-parameterize constructor
// below student class is a example of non-paramtereized constructor
     Student(){

        marks = new int[3];

     System.out.println("constructor called...");
     }

// 2nd parameterized constructor (constructor with parameters)

     Student(String name){
        marks = new int[3];
        this.name = name;
     }
// 3rd shallo copy constructor

    // Student(Student s1){
    //        marks = new int[3];
    //         this.name = s1.name;
    //         this.roll = s1.roll;
    //         this.marks= s1.marks;
            
    // }

    //deep copy constructor
// in this constructor we make a new object or memory for copy constructor
    Student(Student s1){

        marks = new int[3];
        this.roll = s1.roll;
        this.name = s1.name;
        for(int i=0; i<marks.length;i++){

            this.marks[i] = s1.marks[i];
        }
    }
}




class nonpara{
  


}
