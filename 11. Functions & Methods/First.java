//Sum of two numbers in many ways

import java.util.*;

public class First{

    public static void calculateSum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }

    public static void calculateSum2(int num1,int num2){
        int sum=num1+num2;
        System.out.println(sum);
    }

    public static int calculatesum3(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String args[]){
        calculateSum();
        int num1=6;
        int num2=8;
        calculateSum2(num1,num2);
        System.out.println(calculatesum3(num1,num2));
    }
}