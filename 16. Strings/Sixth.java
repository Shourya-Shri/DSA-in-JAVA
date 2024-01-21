// String Functions-->Compare

public class Sixth{
    public static void main(String args[]){
        String S1="Tony";
        String S2="Tony";
        String S3=new String("Tony");
// * If we made string with new keyword then it creates new string.
// * And we don't then S2 will just point out to old string S1.
        if(S1==S2){     // Equal
            System.out.println("S1 and S2 are equal");
        }else{
            System.out.println("Not equal");
        }
        if(S1==S3){     // Not Equal
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
//When we need to compare to strings then we don't use the == operator
// Hence we use --> |.equals| function
// (==)check that too strings are equal at object level or not.
        if(S1.equals(S3)){
            System.out.println("Equals");  //Equals
        }
        else{
            System.out.println("Not Equals");
        }

    }
}