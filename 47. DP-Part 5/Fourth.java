/*
# Count BSTs(Variation of catalan)
=> Find number of all possible BSTs with given n nodes.
n=3(10,20,30)
# Time Complexity: O(n^2)
*/

public class Fourth {
    public static int CountBst(int n){
        
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                int left=dp[j];     //dp[i]+=dp[j]*dp[i-j-1];  //ci=cj* ci-cj-1
                int right=dp[i-j-1];

                dp[i]+=left*right;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        System.out.println(CountBst(9));
    }
}
