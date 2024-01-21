//sum of first n natural number

import java.util.*;

public class Fourth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int counter=1;

        while(counter<=n){
            sum+=counter;
            counter++;
        }

        System.out.println("The sum of n number is " + sum);
    }
}