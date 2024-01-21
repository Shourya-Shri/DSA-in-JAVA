//Binary String Problem

//Print all Binary String of size N without Consecutive ones

public class Ninth{

    public static void printBinString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
            printBinString(n-1,0, str+"0");
            printBinString(n-1, 1, str+"1");
        }else{
            printBinString(n-1,0, str+"0");
        }
    }

    public static void printBinString1(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString1(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinString1(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        //printBinString(3, 0, "");
        printBinString1(3, 0, "");
    }
}