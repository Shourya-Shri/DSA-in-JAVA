/*
# Heap Sort--O(nlogn)
=> Merge sort and quick sort are more efficient than heap sort that's why in gnereral we use that.

Steps:-
1. Arr-> Max heap convert-> Call non-leaf nodes-> heapify
2. Push largest element at end:-> Swap(0,last)-> heapify(0)
*/

public class Fourth {
    
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if(left<size && arr[left]>arr[maxIdx]){  //arr.get(minIdx)<arr.get(left)=> for descending
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx]){  //arr.get(minIdx)<arr.get(right)==>for descending
            maxIdx=right;
        }
        if(maxIdx!=i){
            //Swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void heapsort(int arr[]){
        //Step-1=> Build max heap
        int n=arr.length;

        for(int i=n/2;i>0;i--){
            heapify(arr, i, n); //O(n/2*logn)-> O(nlogn)
        }
        // step-2=>Push largest at end
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, i);// O(nlogn)
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,3};
        heapsort(arr);

        //print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
