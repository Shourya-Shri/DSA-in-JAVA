/* 1. Generally used for Optimization problem 
   2. Sorting
   3. No fixed rule
   4. May not realize
*/
// Definition - Greedy algorithm is the problem solving technicque where we make the locally optimum choice at each stage & hope to achieve a global optimum.

// Activity Selection -{Extremely Important, Facebook,MS, Flipkart & regularly asked} 

// Q.) You are given n activities with their start  and end times. Select the maximum number of activities that can be performed by asingle person, assuming that a person can only work on a single activity at a time, Activities are sorted according to their end time.

// Activity selection Code - O(n)

import java.util.*;

public class First {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};  //end time basis sorted

        int maxAct=0;
        ArrayList<Integer> ans =new ArrayList<>();

        //1st activity

        maxAct=1;
        ans.add(0);
        int lastend=end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                //activity select
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Max activities = "+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i)+ " ");
        }
        System.out.println();
    }
}
