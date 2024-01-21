//Binary One's compliment-Also known as NOT operator

public class Second {
    public static void main(String args[]){
        System.out.println(~5);// Find one's compliment of the five, then again find one's compliment of that number, then add 1 to that number.MSB decides whether the number will be positive or negative. If MSB if 0, it means the number is positive and if MSB is 1,it means that the number is negative.
        System.out.println(~0);//=> 00000000-->One's compliment==>11111111-->One's compliment==>00000000--> Add 1==> 00000001 equals to -1.

        //Left Shift Operator
        System.out.println(5<<2); // Shortcut=> a*2^b

        // Right Shift operator

        System.out.println(6>>1); // SHotcut=> a/2^b
    }
}
