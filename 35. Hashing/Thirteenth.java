//Count Distinct Elements-Means unique elements

//num={4,3,2,5,6,7,3,4,2,1}, ans=> 7

import java.util.*;

public class Thirteenth {
    public static void main(String args[]){
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println(set.size());
    }
}
