/* TILING PROBLEM-- Given a "2*n" floor and tiles of size "2*1", Count the number of ways to tile the given board using the 2*1 tiles (A tile can be placed horizontally or Vertically either)
Vertical ways=(n-1)  & Horizontal ways=(n-2)
 */

public class Sixth{
    public static int TilingProblem(int n){// 2*n(n=breadth)
        //base case
        if(n==0||n==1){
            return 1;
        }
        //vertical line
        int fnm1=TilingProblem(n-1);

        //Horizontal line
        int fnm2=TilingProblem(n-2);

        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(TilingProblem(9));
    }
}