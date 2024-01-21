//Linked Hash Set==> Ordered using DLL
//Performance:-  LHM < HM, LHS < HS--TC-O(1), because in LHM/LHS we perform extra operations to maintain order.

import java.util.*;

public class Eleventh {
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Hyderabad");
        System.out.println(cities);

        LinkedHashSet<String> cities1=new LinkedHashSet<>();
        cities1.add("Bangalore");
        cities1.add("Chennai");
        cities1.add("Delhi");
        cities1.add("Hyderabad");
        System.out.println(cities1);  //Alphabetical order
    }
}
