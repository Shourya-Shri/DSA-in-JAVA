/*
TreeMap:-
1. Key are in sorted order
2. Put,get,remove are O(logn)
3. It gets implemented in the form of Red Black Trees(nodes). Res black trees are self balancing trees.
*/

import java.util.TreeMap;
import java.util.HashMap;

public class Fifth {
    public static void main(String args[]){

        TreeMap<String,Integer> tm= new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);
        System.out.println(tm); //Alphabetically sorted order.
    }
}