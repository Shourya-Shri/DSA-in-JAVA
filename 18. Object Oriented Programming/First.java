//Class is the blue print of objects.
//Objects--> Entities in the real world

//By convention, always starts the class name with capiatl letters.

public class First{

    public static void main(String args[]){
        Pen p1=new Pen();
        p1.SetColor("Blue");
        System.out.println(p1.color);
        //0r
        p1.color="Yellow";
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
//Ty to always make other classes below public class.
class Pen{
    //property+function
    String color;
    int tip;

    void SetColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void claculatePercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }
}