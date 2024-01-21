/*
# Minimum Array Jumps
=>int arr[]={2,3,1,1,4}(Jumps)
=>The number in array shows that at this index how many jumps you can take.
*/

import java.util.*;

public class Fifth {
    public static int minJumps(int nums[]){
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);

        dp[n-1]=0;  //At last index the way to reach last index is 0.

        for(int i=n-2;i>=0;i--){

            int steps=nums[i];
            int ans=Integer.MAX_VALUE;

            for(int j=i+1;j<=i+steps && j<n;j++){
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        return dp[0];
    }
    public static void main(String args[]){
        int nums[]={2,3,1,1,4};
        System.out.println(minJumps(nums));
    }
}
