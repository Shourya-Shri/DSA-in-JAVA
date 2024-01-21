/*
# Mountain Ranges-(Catalan Variation)
=> Mountain & Valleys -{at any moment the number of down strokes cannot be more then number of up strokes}
# Time Complexity: O(n^2)
*/

public class Fifth {
    public static int MountainRanges(int n){
        
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                int inside=dp[j];     //dp[i]+=dp[j]*dp[i-j-1];  //ci=cj* ci-cj-1
                int outside=dp[i-j-1];

                dp[i]+=inside*outside;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        System.out.println(MountainRanges(9));
    }
}
