/*
# Majority Element:- O(n)
# Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/3 ⌋ times. Find all the majority element.
nums[]={1,3,2,5,1,3,1,5,1};
(num,freq)->map
*/

import java.util.*;

public class Sixth{
    public static void main(String[] args){
        int arr[]={1,3,2,5,1,3,1,5,1,3};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> keySet=map.keySet();
        for(Integer key: keySet){ //for each loop is used when we have to iterate over collections of objects.
            if(map.get(key)>=arr.length/3){ //if the frequency of the element is more than n/3, then it is the majority element.
                System.out.println(key);
            }

        }
    }
}