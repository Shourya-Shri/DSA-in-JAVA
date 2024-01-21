/*
# Wildcard Matching- {Hard} --//O(n*m)
=> Given a text and a wildcard patter, implement wildcard pattern matching algorithm that if wildcard pattern is matvhed with text. The matching should cover the entire text(not partial text). The wildcard pattern can include the characters '?' and '*'.

i) '?'-Matches any single character.
ii) '*'-Matches any sequence of characters(including the empty sequence).

Text = 'baaabab'
Pattern= "*****ba*****ab"
output==true

Text = "baaabab"
Pattern="a*ab"
output=true

Text = "abcd"
Pattern= ab&&
*/

public class First { 
    public static boolean isMatch(String s,String p){
        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

        //initialize
        dp[0][0]=true;

        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }
        //bottom-up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //valid
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j]=false;
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        String s="baaabab";
        String p="*****ba*****ab";

        System.out.println(isMatch(s, p));
    }
}

