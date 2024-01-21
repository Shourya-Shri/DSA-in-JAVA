/*
TreeSet=> Implemented in the form of treeMap(red black tree)

1. Sorted in ascending order.
2. Null values are not allowed.(In hashset & Linkedhashset, null values are allowed because it has to arrange values)
3. insert & remove-->O(logn)
4. Some functions which are in treeMap are in treeSet.
*/

import java.util.*;

public class Twelth {
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");
        
        System.out.println(cities);

        TreeSet<String> cities1=new TreeSet<>();
        cities1.add("Delhi");
        cities1.add("Hyderabad");
        cities1.add("Bangalore");
        cities1.add("Chennai");
        System.out.println(cities1); 
    }
}