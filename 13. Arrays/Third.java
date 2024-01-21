//Largest and Smallest in Array

import java.util.*;

public class Third{
    public static void getLargestAndSmallest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(Smallest>numbers[i]){
                Smallest=numbers[i];
            }
        }
        System.out.println("Largest number ->" + largest);
        System.out.println("Smallest number ->" + Smallest);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9};
        getLargestAndSmallest(numbers);
    }
}