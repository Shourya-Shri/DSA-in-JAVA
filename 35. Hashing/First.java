/*
# Hashing=> When we used to change the form of data into another using a function,then that is known as Hashing. We use hash function to change one form of data into another.
-> With the help of hashing, we create two other data structure:-
1. Map--> i) Hashmap
         ii) Linked Hashmap
        iii) Treemap
2. Set--> i) Hashset
         ii) Linked Hashset
        iii) TreeSet

=> These are the data structure in which the time complexity to add,subtract & search are extremely optimized.

# HashMap:-
=> It is a type of data structure which stores data in the form of table in (key,value) pair.In this key is unique and value can be same.
=> HashMap can be visualized in the form of data table as well as node.

--> Time complexity of hashmap for Insert,remove, Search is O(1).

*/

/*
# HashMap Operations:-
import java.util.HashMap;
HashMap<String,Integer> hm=new HashMap<>();
1. put(key,value)--O(1)
2. get(key)--O(1)
3. containsKey(key)--O(1)
4. remove(key)--O(1)

==> Hashmaps doesn't follow any order, it means it doesn't matter in which order you insert the values in hashmaps, it will return in its own way.


*/

import java.util.*;

public class First {
    
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //Insert--O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);

        //Get-O(1)

        int population=hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        //ContainsKey--O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove--O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
