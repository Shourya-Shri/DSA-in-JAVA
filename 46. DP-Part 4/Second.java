/*
# Longest Increasing Subsequence(Tabulation)  --Variation of least common subsequence

Approcah=> We first add all items of given array1 to hashset, then we put item to arr2 from hashset. Then we sort arr2 and we apply the concept of least common subsequence.
*/
import java.util.*;
public class Second {  //O(nW)
    public static int lcs(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];

        //initialize
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //valid
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static int lis(int arr1[]){

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int arr2[]=new int[set.size()];  //Sorted unique element
        int i=0;
        for(int num:set){
            arr2[i]=num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1,arr2);
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={50,3,10,7,40,80};

        System.out.println(lis(arr));
    }
}