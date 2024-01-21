/*
# What is DP?(Definition)
=> Dp is optimized recursion.

# How to identify DP?
a.) Optimal Problem---------Greedy->least,most,min,max,largest,smallest
b.) Some choice is given.

DP definition(official)
-> DP is atechnique in computer programming that helps to efficiently solve a class of problems that have overlapping subproblems(Choice) and optical substructure property(Optical right answer for smallest problem).

# Ways of DP:-
1. Memoization :-(Top Down approach)
   a. Recursion
   b. Subproblems-> Storage(memory)

2. Tabulation :-(Bottom Up)
   a. It is efficient.
   b. We used to create table.
   c. It might seem a bit difficult in complex problem.

*/
/*
Tabulation for fibonacci:- 
a. Initialization Small-dp[0]=0 and dp[1]=1
b. Meaning(assign in mind)
c. Filling
*/

public class Second {
    public static int fibtabulation(int n){   //O(n)
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];  //ans
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fibtabulation(n));
    }
}



/*
# 7 important question(& concepts ->70 Qs), these are approaches:-

1.) Fibonacci : a) Climbing Stairs
                b) Number Factors
                c) Min Jumps to reach the end
                d) Min Jumps with cost
                e) House thief

2.) 0-1 Knapsack: a.) Subset Sum
                  b.) Equal Subset sum partition
                  c.) Min Subset sum difference
                  d.) Count of subset sum
                  e.) Target Sum

3.) Unbounded Knapsack: a.) Rod cutting
                        b.) Coin Change
                        c.) Min coin Change
                        d.) Max Ribbon Cut

4.) LCS : a.) Longest Common Substring
          b.) Edit Distance
          c.) Box stacking
          d.) Longest Increasing subsequence
          e.) Longest Bitonic Subsequence
          f.) Subsequence Pattern Matching
          g.) Min Add/Delete to convert string to another

5.) Catalan Problem : a.) No of BSTs
                      b.) N parenthesis
                      c.) Convex Polygon
                      d.) Disjoint chords
                      e.) Catalan Triangle
                      f.) Mountain Ranges
                      g.) Dyck words
*/
