//Reverse an Array

public class Fifth{

    public static void PrintArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }

    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
        PrintArray(numbers);
    }
    public static void main(String args[]){
        int numbers[]={7,5,3,9,6,4,1,0,3};
        reverse(numbers);
    }
}