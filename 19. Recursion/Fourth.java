//Last occurence of an element

public class Fourth{
    public static int LO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LO(arr,key,i+1);
        if(isFound!=-1){
            return isFound;
        }
        //check with self
        if(arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int LO2(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LO(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int a=LO(arr, 5, 0);
        int b=LO2(arr, 3, 0);
        System.out.println(a);
        System.out.println(b);
    }
}