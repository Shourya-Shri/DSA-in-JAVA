/*
# Climbing Stairs
=> Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.

// Climbing stairs variation, 1,2,3 stairs at a same time.
ways(n)=way(n-1)+way(n-2)+way(n-3); and same goes on.
*/
import java.util.*;
public class Third{
    //Recursion
    public static int RecursionCountways(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return RecursionCountways(n-1)+RecursionCountways(n-2);
    }
    //memoization
    public static int RecursionMemoization(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){  //Already calculated
            return ways[n];
        }
        ways[n]=RecursionMemoization(n-1, ways)+RecursionMemoization(n-2, ways);
        return ways[n];
    }
    //Tabulation
    public static int Tabcountways(int n){
        int dp[]=new int[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(RecursionCountways(n));
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(RecursionMemoization(n, ways));
        System.out.println(Tabcountways(n));
    }
}