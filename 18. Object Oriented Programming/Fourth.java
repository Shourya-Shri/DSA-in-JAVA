//Constructor
public class Fourth{
    public static void main(String args[]){
        Student1 s1=new Student1();
        Student1 s2=new Student1("Shourya");
        Student1 s3=new Student1(123);
    }
}
class Student{
    String name;
    int roll;

    Student(String name){  //Initialization
        this.name=name;
    }
}
//Constructor Overloading--> It means the phenomenon in which we acn create any object & according to creation of that object,suitable constructor will be called
class Student1{
    String name;
    int roll;

    Student1(){
        System.out.println("Constructor");
    }
    Student1(String name){
        this.name=name;
    }
    Student1(int roll){
        this.roll=roll;
    }
}