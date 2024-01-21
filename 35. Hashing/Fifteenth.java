/*
Find itinerary from Tickets

from-> to
chennai-> Bengaluru
Mumbai-> Delhi
Goa-> Chennai
Delhi-> Goa
==> Mumbai-> Delhi-> Goa-> Chennai-> Bengaluru

Tricky part is finding the starting point that which has only from and not to.
 */
import java.util.*;

public class Fifteenth {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();

        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; //Starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();

        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start=getStart(tickets);
        System.out.print(start);

        for(String key: tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
    
}
