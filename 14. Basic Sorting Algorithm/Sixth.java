//Counting Sort --> It is used when we know that the range of numbers are less
//On positive number only

public class Sixth{
    public static void CountingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        PrintArray(arr);
    }
    public static void PrintArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        CountingSort(arr);
    }
}