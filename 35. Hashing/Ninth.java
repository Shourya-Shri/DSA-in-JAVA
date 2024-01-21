/*
# HashSet=> A hashSet is a collection of items where every item is unique,and it is found in the java.uti. package.
1. No duplicates
2. Unordered
3. NULL is allowed

=> HashSet is implemented by hashMap in java. Similary LHM<-> LHS,TM<->TS

Operations-add,contains,remove-O(1)
*/

import java.util.*;
public class Ninth{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set); //=> [1,2,4](No duplicates)

        if(set.contains(2)){
            System.out.println("2 is in the set");
        }
        if(set.contains(3)){
            System.out.println("3 is in the set");
        }
        set.remove(1);
        if(set.contains(1)){
            System.out.println("1 is in the set");
        }
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}