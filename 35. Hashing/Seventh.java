//Optimised Majority element code.

import java.util.*;

public class Seventh{
    public static void main(String[] args){
        int arr[]={1,3,2,5,1,3,1,5,1,3};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1); //Here if value exists, it will return arr[i] and 0 if it does not exists and irrespective of what it return it will add +1 to increase its frequency.
        }
        for(Integer key: map.keySet()){ 
            if(map.get(key)>=arr.length/3){ 
                System.out.println(key);
            }

        }
    }
}