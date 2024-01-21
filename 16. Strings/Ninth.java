// StringBuilder=> Its type is not string but we can convert it into string.

public class Ninth{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);//It is used to add character at last
        }//abcdefghijklmnopqrstuvwxyz  TC->O(26)
        System.out.print(sb);
    }
}