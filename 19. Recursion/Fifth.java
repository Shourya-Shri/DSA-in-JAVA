//Print x to the power n

public class Fifth{
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=Power(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    //Optimised
    public static int OptimisedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=OptimisedPower(a, n/2)*OptimisedPower(a, n/2);
        //if n is odd,int halfPower=halfPower*halfPower
        if(n%2!=0){
            halfpower=a*halfpower;
        }
        return halfpower;
    }
    public static void main(String args[]){
        System.out.println(Power(2, 3));
        System.out.println(OptimisedPower(2, 6));
    }
}