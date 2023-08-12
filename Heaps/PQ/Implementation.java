package Heaps.PQ;
import java.util.*;

public class Implementation {

    static class Student implements Comparable<Student> {

        String name;
        int rank;

        public Student(String name, int rank) { //constructor
            this.name = name;
            this.rank = rank;
        }

        @Override //it use when we have to use parent class properties
        public int compareTo(Student s2) { // compareTo is a inbuild function

            return this.rank - s2.rank; // it use to set the priority
        }
    }

    public static void main(String[] args) {        

        // crearing a pq by passing the Student object

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("a", 50));
        pq.add(new Student("b", 5));
        pq.add(new Student("c", 53));
        pq.add(new Student("d", 13));
        pq.add(new Student("e", 6));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
        System.out.println();


    }
    
}
