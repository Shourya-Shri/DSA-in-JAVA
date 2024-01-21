//MULTILEVEL INHERITANCE

public class Sixth{
    public static void main(String args[]){
        
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
//Derived Class
//Multi level Inheritance

class Mamal extends Animal{
    int legs;
}
class Dog extends Mamal{
    String breed;
}