//Conver from Binary to Decimal

import java.util.*;

public class Ninth{
    public static void BinToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(int)(lastDigit*Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+ myNum + " is " + decNum);
    }

    public static void main(String args[]){
        BinToDec(111);
    }
}