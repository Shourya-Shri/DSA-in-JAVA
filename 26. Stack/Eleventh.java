/* Maximum Rectangular Area in Histogram-{ Microsoft,Python,Facebook}
Given an array of Integers heights representing the histogram bars height where the width of each bar is 1, return the user of the largest rectangle in the histogram. TC=O(n)
 */
// i) First of all we'll find next Smaller left indices and next smaller right indicies for the index.
// In NSR we don't use -1 for valid width

import java.util.*;
public class Eleventh{
    public static void MaxArea(int arr[]){
        int maxArea=0;
        int NSR[]=new int[arr.length];
        int NSL[]=new int[arr.length];
        //Next Smaller Right

        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NSR[i]=arr.length;
            }else{
                NSR[i]=s.peek();
            }s.push(i);
        }
        //Next Smaller Left
        s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NSL[i]=-1;
            }
            else{
                NSL[i]=s.peek();
            }
            s.push(i);
        }
        //Current Area: Width =j-i-1=NSR[i]-NSL[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=NSR[i]-NSL[i]-1;
            int CurrArea=height*width;
            maxArea=Math.max(CurrArea,maxArea);
        }
        System.out.println("Max Area in histogram= "+ maxArea);
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3}; //heights
        MaxArea(arr);
    }
}