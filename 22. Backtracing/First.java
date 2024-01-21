//Bactracking-->It means, when we go on to the path & realizes that it's wrong then to return back to the source by following the same path.
/* 
Types of Backtrcking:-
1. Decision => Whether it can be solved or not.
2. Optimization => Time
3. Enumeration => All Possible Solutions 
 */

// Backtracking on Arrays- Decrese all the elements by 2.

public class First{
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }//recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}