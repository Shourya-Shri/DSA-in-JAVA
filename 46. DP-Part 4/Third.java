/*
# Edit Distance-{Very Famous}

=> Given two strings word 1 and word 2, return the minimum number of operations required to convert word 1 to word 2.
You have the following 3 operations permitted on a word:
i) Insert a charcter
ii) Delete a character
iii) Replace a character

word 1="intension", word 2="execution";  ans=5

intention->inention(remove t)
inention ->enention(replace 'i' with 'e')
enention ->exention(replace 'n' with 'x')
exention ->exection(replace 'n' with 'c')
exection ->execution(insert 'u')
*/

/*
# Least Common Subsequence(Tabulation)
*/

public class Third {  //O(nW)
    public static int editDistance(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //valid
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int rep=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add,Math.min(del,rep));
                }
            }
        }
        print(dp);
        return dp[n][m];
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
        String str1="intention";
        String str2="execution";

        System.out.println(editDistance(str1, str2));
    }
}
