//Switch Statement

import java.util.*;

public class Fifth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num){
            case 1: System.out.println("Samosa");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Mango Shake");
            break;
            case 4: System.out.println("We woke up");
            break;
            default: System.out.println("Not matched, chose only between 1-4");
        }
    }
}
