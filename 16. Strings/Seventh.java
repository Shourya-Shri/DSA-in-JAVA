// String Functions -- SubString==> In a continuos manner
// Subsequence => Any random manner {Hello World}-- ewd is a subsequence

public class Seventh{
    public static String SubString(String str,int si,int ei){
        String substr="";  //{Initialised with empty}
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.println(SubString(str,0,5));

        String n=str.substring(1,5);//Inbuilt function of Substring in java
        System.out.println(n);
    }
}