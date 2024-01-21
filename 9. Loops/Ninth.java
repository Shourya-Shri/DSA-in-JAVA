//Break Statement- To exit the loop

// Print 1 to 5 and take exit at 3

public class Ninth{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");
    }
}