//Selection Sort --> Pick the smallest from Unsorted, put it at the beginning.

public class Second{
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){   //turns
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //Swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        PrintArray(arr);
    }
    public static void PrintArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
    }
}