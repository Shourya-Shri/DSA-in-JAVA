/*
# Minimum Partitioning - {Variation of 0-1 knapsack}
number[]={1,6,11,5}
minn of diff=1

Pseudo Code:-
i)   Find sum of all element.
ii)  dp[n+1][W+1]==> W=sum/2;
iii) 0-1 knapsack
dp[n][W]=Sum1
*/

import java.util.*;

public class Fourth {
    public static int minPartition(int arr[]){
        int n=arr.length;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int W=sum/2;

        int dp[][]=new int[n+1][W+1];

        //Bottom-Up

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(arr[i-1]<=j){//Valid
                    dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
                }else{  //Valid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String args[]){
        int arr[]={1,6,11,5};
        System.out.println(minPartition(arr));
    }
}
