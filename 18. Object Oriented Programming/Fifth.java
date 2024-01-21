//INHERITANCE-->Inheritance is when properties & methods of base class are based on to a derived class.
public class Fifth{
    public static void main(String args[]){
        Animal a1=new Animal();
        a1.eat();
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
//Single level Inheritance

class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims in water");
    }
}