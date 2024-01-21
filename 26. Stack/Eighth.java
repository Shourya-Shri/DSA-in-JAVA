/* Next greater element-{Very Important, Very Classical} */

//The next greater element of some element n in an array is the first gretaer element that is to the right of n in the same array.

//arr=[6,8,0,1,3]
//next greater=[8,-1,1,3,-1]

import java.util.*;

public class Eighth {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1 while

            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2 if else
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+ " ");
        }
        System.out.println();
    }
}

/*Some different forms of this;
i) Next greater left- Just change for loop
ii) Next Smaller Right- In while(>=)
iii) next Smaller left- for(o to n) while(>=)
*/
