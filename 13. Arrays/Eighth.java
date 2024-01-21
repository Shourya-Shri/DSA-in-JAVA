//Max SubArray SUM-1(Brute Force)

public class Eighth{
    public static void printMAx(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    //Subarray Sum
                    currSum+=numbers[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum of Sub Array = " + maxSum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,2};
        printMAx(numbers);
    }
}