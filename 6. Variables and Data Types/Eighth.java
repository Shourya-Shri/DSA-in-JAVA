//Type promotion and Expression

import java.util.*;

public class Eighth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a='a';
        char b='b';
        System.out.println(b-a);//98

        System.out.println((int)(b)); //65
        //short c=5;
        //int d=25;
        //char e='c';
        // byte bt=c+d+e;  //Mismatch

        int c=10;
        float d=20.25f;
        long e=25;
        double f=30;
        double ans=c+d+e+f;

        System.out.println(ans);

        //Wrong

        //byte b=5;
        //b=b*2;

        //Right

        byte z=5;
        z=(byte)(z*2);
        System.out.println(z);
    }
}
