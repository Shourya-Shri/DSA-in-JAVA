//Check if a number is Prime or not(Optimised method)

import java.util.*;

public class Seventh{

    public static boolean isPrime(int n){

        if(n==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.print(isPrime(b));
    }
}