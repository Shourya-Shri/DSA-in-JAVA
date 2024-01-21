//Max SubArray Sum-2(Prefix Array0-->Formula

public class Ninth{

    public static void SubArraySum(int numbers[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];

        //Calculate Prefix Sum

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;

                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1]; //Formula

                if(max<currsum){
                    max=currsum;
                }
            }
        }
        System.out.println("Max SubArray Sum ="+ max);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        SubArraySum(numbers);
    }
}