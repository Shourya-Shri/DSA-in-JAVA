/* For Descending:-
import java.util.Collections;
Arrays.sort(arr,Collections.reverseOrder());

Arrays.sort(arr,startingIndex,EndingIndex,Collections.reverseOrder());

 */

import java.util.Collections;
import java.util.Arrays;  //import java.util.*;

public class Fifth{
    public static void main(String args[]){
        Integer arr[]={2,4,1,3,5}; //This array is an object of Integer class
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
