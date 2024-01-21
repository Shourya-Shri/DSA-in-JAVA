/*
# Introduction to Dp-{FAANG,DP,graph}

Dynamic Programming=> The optimised way of solving the problems that we have solved so far is known as Dynamic Programming.
*/

//Fibonacci=> 0 1 1 2 3 5 8 13 21 34 55

public class First {

    public static int fib(int n){  //O(n^2)
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fib2(int n,int f[]){  //O(n)
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=fib2(n-1,f)+fib2(n-2,f);
        return f[n];
    }
    public static void main(String args[]){
        int n=6;
        int f[]=new int[n+1];
        System.out.println(fib2(n,f));
    }
}
// We have done Advanced Recursion in which we have not just solved the recursion by calling function but have also stored the value of small works.This is known as Memoization.

