//Inbuilt Sort

import java.util.Arrays;
/* Arrays.sort(arr) -->>Sort a function in which we have our array as argument
O(nlogn) << O(n^2).....By default it is in Ascending order

Another Way -> Arrays.sort(arr,starting index,ending index)

*/

public class Fourth{
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}