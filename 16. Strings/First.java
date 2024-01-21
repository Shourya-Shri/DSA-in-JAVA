// STRINGS

import java.util.*;

public class First{
    public static void main(String args[]){
        String str="abcd";
        char arr[]={'a','b','c','d'};   
        String str2=new String("xyz");
        //As a programmer we have almost same meaning for them out in memory(str &str2)
         System.out.println(str + " , "+str2);

         // Note--> Strings in java are immutable

         Scanner sc=new Scanner(System.in);

         String name; // The moment we'll pree enter, it will be over
         name=sc.next(); //next function only takes single word that's why we'll use nextLine();

         String name2=sc.nextLine();

         System.out.println(name + "," + name2);
    }
}