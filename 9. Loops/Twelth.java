//Display all the numberes entered by the users except multiple of 10

import java.util.*;

public class Twelth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number");
            int n=sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("Number was" + n);
        }while(true);
    }
}