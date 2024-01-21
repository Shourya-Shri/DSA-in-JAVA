//Pair Sum-1(Brute Force--> All Pairs=>O(n^2))
/* Find if any pair in a sorted ArrayList has a target Sum */

import java.util.*;

public class Eighth{
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=8;
        System.out.println(pairSum1(list, target));
    }
}