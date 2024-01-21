//Print SubArrays => A continuous part of array

public class Seventh{
    public static void PrintSubarrays(int number[]){
        int ts=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                System.out.print("(");
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]);
                    if(k<end){
                        System.out.print(",");
                    }
                }
                System.out.print(") ");
                ts++;
            } 
            System.out.println();       
        }
        System.out.println("Total Subarrays = " + ts);
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        PrintSubarrays(number);
    }
}