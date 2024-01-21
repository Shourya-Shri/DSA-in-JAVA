// String Compression {Amazon}(Very Popular Question)
//"aaaabbcccdd"=>"a3b2c3d2"

public class Eleventh{
    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1; //Because we have to convert the count to string that's why we are making it with integer class
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str="aaabbccc";
        System.out.println(compress(str));
    }
}