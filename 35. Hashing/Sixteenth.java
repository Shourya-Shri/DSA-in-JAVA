/*
# Largest Subarray with 0 sum--O(n)
arr={15,-2,2,-8,1,7,10,23}
ans=5
arr={3,4,5}
ans=0

We'll use pre sum property=> sum[i+1,j]=sum[0,j]-sum[0,i]
For sum 0, 0=sum(j)-sum(i)
===========> sum(j)=sum(i)
*/

import java.util.*;

public class Sixteenth {
    public static void main(String args[]){

        int arr[]={15,-2,2,-8,1,7,10,23};

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int len=0;

        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len=Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println(len);
    }
}
