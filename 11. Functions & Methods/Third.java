//Find product of a & b

import java.util.*;

public class Third{
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(multiply(a,m));
    }
}