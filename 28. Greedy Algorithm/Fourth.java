//Minimum Sum absolute difference pairs - O(nlogn)
/*
Q.) Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that sum S of absolute difference of all pairs is maximum
a=[1,2,3]
b=[2,1,3]
ans=0
 */

import java.util.*;

public class Fourth {
    public static void main(String args[]){
        int A[]={1,2,3};
        int B[]={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Min absolute difference of pairs = " + minDiff);
    }
}

//abs= Absolute function in java.
