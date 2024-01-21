// Activity selection code, if not sorted on the basis of end time

import java.util.*;

public class Second {
    public static void main(String args[]){
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};  //end time basis sorted

        //sorting
        int activities[][]=new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lambda function--> Short form of a big funcyion, comparator
        //Ascending order
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));  // o[2] means sorting on the basis of 2nd column. //In java, Comparator is an interface for sorting Java objects.

        int maxAct=0;
        ArrayList<Integer> ans =new ArrayList<>();

        //1st activity

        maxAct=1;
        ans.add(activities[0][0]);
        int lastend=activities[0][2];

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }
        }
        System.out.println("Max activities = "+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i)+ " ");
        }
        System.out.println();
    }
}

// Explanation of greedy approach=> We'll start with that there exists a better solution for the question & later if that can't, then we say that this is the best approach.