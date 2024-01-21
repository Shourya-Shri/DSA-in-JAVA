/*
# Catalan's Number(Recursion + Memoization)--Cocept( 10-15 Q)

=> C0=1
   c1=1
   c2=c0.c1+c1.c0=2
   c3=c0.c2+c1.c1+c2.c0=5

-> Like fibonacci

Cn=C0.Cn-1+C1.Cn-2+.......+Cn-1.C0
*/

import java.util.*;

public class Second {
    public static int catanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;   // Cn

        for(int i=0;i<n-1;i++){
            ans+=catanRec(i)*catanRec(n-i-1);
        }
        return ans;
    }
    public static int catanMem(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;   // Cn

        for(int i=0;i<n-1;i++){
            ans+=catanMem(i,dp)*catanMem(n-i-1,dp);
        }
        return dp[n]= ans;
    }
    public static void main(String args[]){
        int n=10;
        System.out.println(catanRec(n));

        int m=400;
        int dp[]=new int[m+1];
        Arrays.fill(dp,-1);
        System.out.println(catanMem(m,dp));
    }
}
