/*
# Rod Cutting
=> Given a rod of length n inches and an array of prices that includes prices of all prices of size smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces.

length={1,2,3,4,5,6,7,8}
price={1,5,8,9,10,17,17,20}
*/

public class Second {  //O(nW)
    public static int rodcutting(int length[],int price[],int totalRod){
        int n=price.length;

        int dp[][]=new int[n+1][totalRod+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<totalRod+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<totalRod+1;j++){
                //valid
                if(length[i-1]<=j){ //valid
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);  //in 0-1 after including we were finding values from (i-1) but here we'll find value from i.
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][totalRod];
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
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int totalRod=8;

        System.out.println(rodcutting(length, price, totalRod));
    }
}