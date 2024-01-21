//Ternary Operator

import java.util.*;

public class Fourth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String type=((num%2==0)? "Even":"odd");
        System.out.println(type);
    }
}