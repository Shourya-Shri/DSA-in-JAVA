// Iteration on HashMap

import java.util.*;

public class Second {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        //Iterate
        Set<String> keys=hm.keySet();  //keySet returns all the keys of hm.
        System.out.println(keys);

        for(String k: keys){ //for-each data structure
            System.out.println("Key->"+k+ ",value="+hm.get(k));
        }
    }
}
