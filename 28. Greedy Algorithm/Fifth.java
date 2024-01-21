/* Max Length chain of Pairs --O(nlogn)

Q.) You are givenn pairs of numbers. In every pair, the first number is always smaller than the second number. A pair(c,d) can come after pair (a,b) if b<c. Find the largest chain which can be formed from a given set of pairs.
Pairs=(5,24),(5,28),(50,90),(39,60),(27,40)  ans=3
 */
// This question is same as the activity selection question.

import java.util.*;

public class Fifth {
    
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainlen=1;
        int chainEnd=pairs[0][1]; //Last selected pair that is chain end of last

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainlen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("Max length of chair= "+ chainlen);
    }
}
