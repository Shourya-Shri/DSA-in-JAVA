/*Insertion Sort--> Pick an element(from unsorted part)
and place in the right pos in the sorted part */

//All these are not optimised.....They have TC-O(n^2)

public class Third{
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            //finding out the correct path to be inserted
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Insertion of current element
            arr[prev+1]=curr;
        }
        PrintArray(arr);
    }
    public static void PrintArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        insertionSort(arr);
    }
}