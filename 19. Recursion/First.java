public class First{

    //Descending order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        printDec(n-1);
    }

    //Ascending order
    public static void printInc(int n){
        if(n==1){
            System.out.println(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }

    //Factorial of N
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int fact2(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }

    //Sum of N natural number
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int Sum1=calSum(n-1);
        int Sn=n+Sum1;
        return Sn;
    }
    //Print Nth Fibonacci Number
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String args[]){
        printDec(8);
        printInc(9);

        System.out.println(fact(5));
        System.out.println(fact2(9));
        System.out.println(calSum(10));
        System.out.println(fib(9));
    }
}