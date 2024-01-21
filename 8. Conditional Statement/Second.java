//Print if a number is odd or even

import java.util.*;

public class Second{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        if(A%2==0){
            System.out.println("It is an evem number");
        }
        else{
            System.out.println("It's an odd number");
        }
    }
}