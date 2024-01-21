//Function overloading using data types

import java.util.*;

public class Sixth{

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(3,4));
        System.out.println(sum(3.2f,5.6f));
    }
}