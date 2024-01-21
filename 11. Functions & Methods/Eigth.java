//Print all Primes in a range

import java.util.*;

public class Eigth{

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

    public static void Primerange(int n,int m){
        for(int i=n;i<=m;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        Primerange(4,100);
    }
}