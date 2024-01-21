/*
# Coin Change Problem=> Kind of unbounded knapsack

*/
public class First {  //O(nW)
    public static int coinchange(int coins[],int sum){
        int n=coins.length;

        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){  //ith items
            dp[i][0]=1;
        }
        for(int j=0;j<sum+1;j++){//j-sum/change
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){ //value
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];  //Here we have to find ways not values that's why we are not comparing.
                }else{  //invalid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
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
        int coins[]={1,2,3};
        int sum=4;

        System.out.println(coinchange(coins, sum));
    }
}
