//Max SubArray Sum-3(Kadanes's Algorith)-Important
//Here we apply only single loop
//It basically says where current sum goes negative i.e.,less than zero, then take it as 0 rathere than taking it negative

//for all negative integers it returns 0, so for that to solve make a special case for it. (HW)

public class Tenth{
    public static void Kadanes(int numbers[]){
        int MaxSum=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            MaxSum=Math.max(MaxSum,cs);
        }
        System.out.println("Max SubArray Sum is =" + MaxSum);
    }
    public static  void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        Kadanes(numbers);
    }
}