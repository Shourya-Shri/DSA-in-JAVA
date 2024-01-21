//Bubble Sort --> Large elements come to the end of array by swapping with adjacent element.

public class First{
    public static void BubbleSort(int arr[]){
        for(int turn=1;turn<arr.length;turn++){
            for(int j=0;j<arr.length-turn;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        int arr[]={5,4,3,2,1};
        BubbleSort(arr);
    }
    /*
     public static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintArray(arr);
    }
     */
}