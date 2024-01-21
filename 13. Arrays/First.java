//Arrays are passed by refrence

import java.util.*;

public class First{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        update(marks);   //changes will reflect in main function

        //print marks

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");  //98 99 100
        }
        System.out.println();
    }
}