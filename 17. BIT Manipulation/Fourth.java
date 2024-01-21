public class Fourth {

    //clear ith bits

    public static int clearBits(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }

    //clear bits in range

    public static int clearInRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearBits(15, 2));
        System.out.println(clearInRange(15, 2, 7));
    }
}
