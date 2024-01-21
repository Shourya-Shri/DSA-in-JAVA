/*
# Types of KnapSack Problems:
1. Fractional knapsack (Greedy)
2. 0-1 Knapsack
3. Unbounded knapsack
*/
/*
Approach:-
Case1--> wt<=W  => a.include
                   b. Exclude
else --> Exclude
*/
public class First {
    //Recursive Approach
    public static int knapsackRecursion(int val[],int wt[],int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){//valid
            //include
            int ans1=val[n-1]+knapsackRecursion(val,wt,W-wt[n-1],n-1);
            //exclude
            int ans2=knapsackRecursion(val, wt, W, n-1);
            return Math.max(ans1,ans2);
        }else{
            return knapsackRecursion(val, wt, W, n-1);
        }
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;

        System.out.println(knapsackRecursion(val, wt, W, val.length));
    }
}
