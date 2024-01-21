/*
# Matrix Chain Multiplication(Recursion){Hard}{Extremely IMP, Must Dry Run 40-50 min Dry}.

//Important
A.B=(a*b).(c*d)
Cost=a*b*d
size=a*d
*/

import java.util.*;

public class First {
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;    //Single matrix case
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){

            int cost1=mcm(arr, i, k);   //Ai........Ak=> arr[i-1]*arr[k]
            int cost2=mcm(arr, k+1, j);//Ai+1....Aj=>arr[k]*arr[j]

            int cost3=arr[i-1]*arr[k]*arr[j];

            int findCost=cost1+cost2+cost3;

            ans=Math.min(ans,findCost);
        }
        return ans;    //Min Cost
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        int n=arr.length;

        System.out.println(mcm(arr, 1, n-1));  //30
    }
}
