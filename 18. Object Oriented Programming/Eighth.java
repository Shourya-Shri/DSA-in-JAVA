/* Abstraction
Hiding all the necessary details and showing only the important parts to all the users.
 */

public class Eighth{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();//Mwans every animal should have walk normal function but how it will look,that animal will not tell rather its subclass will.

}
class Horse extends Animal{
    void changecolor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs only");
    }
}
class Chicken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}