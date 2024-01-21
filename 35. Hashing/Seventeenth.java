/*
Subarray sum equal to K

arr={1,2,3}  k=3 How many sub array are their whose count is equal to K.
ans=2 (1,2)(3)

sum(0,j) - sum(0,i)= sum(i+1,j)
=> sum(0,j)-sum(0,i-1)=sum(i,j)

here, sum(j)-sum(i)=k
      sum(j)=sum(i)+k
*/

import java.util.*;
public class Seventeenth {   //O(n)
    public static void main(String args[]){
        int arr[]={10,2,-2,-20,10};
        int k=-10;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);  //(sum,count)
        int sum=0;
        int ans=0;

        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
