/*
# Priority Queue for objects.

Comparable-> It's an interface which is inbuilt and as in class there isn't any logic to compare, thus comparable provides than power through which classes can comapre their objects.
 */

import java.util.PriorityQueue;

public class Second {

    static class Student implements Comparable<Student>{ //Overriding=> As we know when the child class has same function as the parent class.
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){ //compareTo function lies in Comparable interface.
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A",4));  //O(logn)
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank); //O(1)
            pq.remove();
        }
    }
}