//Print number from 1 to n

import java.util.*;

public class Third{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int counter=1;
        while(counter<=number){
            System.out.print(counter + " ");
            counter++;
        }
    }
}