/* ArrayList- Dynamic size inbuilt,we'll just use it. */

/* Primitive data types can't be stored directly */

import java.util.ArrayList;

public class First{
    public static void main(String args[]){
        //Java Collection FrameWork
        //ClassName ObjectName=new ClassName();
        ArrayList<Integer> List=new ArrayList<>();
        ArrayList<String> List2=new ArrayList<>();
        ArrayList<Boolean> List3=new ArrayList<>();

        //Add Elements
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        //Get Element
        int element=List.get(2); //2 is the index==>3
        System.out.println(element);

        //Remove Element

        List.remove(4); //4 is the index ==>output-[1,2,3,4,5]
        System.out.println(List);

        //Set element at index

        List.set(2,10);
        System.out.println(List); //==> [1,2,10,4,6]

        System.out.println(List.contains(1)); // True
        System.out.println(List.contains(11)); //False

        //Size 
        System.out.println(List.size());

        //Print the arrayList
        for(int i=0;i<List.size();i++){
            System.out.println(List.get(i) + " ");
        }
        System.out.println();

        //Print Reverse of an ArrayList
        for(int i=List.size()-1;i>=0;i--){
            System.out.print(List.get(i) + " ");
        }
        System.out.println();

        //Find Maximum
        int max=Integer.MIN_VALUE;
        for(int i=0;i<List.size();i++){
            if(max<List.get(i)){
                max=List.get(i);
            }
        }
        System.out.println("Max Element" + max);
    }
}