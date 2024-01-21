//Java always calls by value

import java.util.*;

public class Second{

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value of 'a' ");
        System.out.println(a);
        System.out.println("The value of 'b' ");
        System.out.println(b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //swap-> value exchange
        System.out.println("Enter the value of 'a' ");
        int a=sc.nextInt();
        System.out.println("Enter the value of 'b' ");
        int b=sc.nextInt();
        swap(a,b);
    }
}