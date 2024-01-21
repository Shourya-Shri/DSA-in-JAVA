//Hierarchial Inheritance

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


class Mamal extends Animal{
    int legs;
}
class Fish extends Animal{
    String breed;
}
class Bird extends Animal{
    void fly(){
        System.out.println("FLY");
    }
}