/*
# Iteration on HashSet:- In java, there is an interface named iterator. Using this iterator we can iterate over sets.
If for any set we call .iterator() function, it will return an iterator for that.
*/

import java.util.*;

public class Tenth{
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Hyderabad");

        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}