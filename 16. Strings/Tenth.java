/* Convert letters to uppercase -{Code NAtion Company}

For a given string convert each of the first letter of each word
to uppercase. Eg:- "hi i am sherry" => "Hi I am Sherry"

After space, a word starts oyh index
*/

public class Tenth{
    public static String UpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="hi i am sherry";
        System.out.println(UpperCase(str));
        System.out.println(str.length()); //14
        System.out.println(Character.toUpperCase(str.charAt(0))); //H
    }
}