//Taking input 

import java.util.*;

public class Third {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.next();
        System.out.println(input);

        System.out.println("Enter 2nd String");
        String name=sc.nextLine();
        System.out.println(name);

        System.out.println("Enter a number");
        int number=sc.nextInt();
        System.out.println(number);

        System.out.println("Enter a Float");
        float price=sc.nextFloat();
        System.out.println(price);
    }
}
