public class Third {

    //Check if Odd or Even
    public static void OddorEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            //Even
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    //Get ith BIT
    public static int getithBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    //Set ith bit->It means whatever will be our number, we'll conver it into 1.
    public static int SetBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    //Clear ith Bit
    public static int clear(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    //Update ith bit
    public static int update(int n,int i,int newBit){
        if(newBit==0){
            return clear(n,i);
        }else{
            return SetBit(n,i);
        }
    }

    //Update ith bit -2nd approach
    public static int update2(int n,int i,int newBit){
        n=clear(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
        OddorEven(3);
        OddorEven(10);
        System.out.println(getithBit(15, 3));
        System.out.println(SetBit(10,2));
        System.out.println(clear(10,1));

        System.out.println(update(10,2,1));
        System.out.println(update2(10, 2, 1));
    }
}
