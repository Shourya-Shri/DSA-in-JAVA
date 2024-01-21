//Duplicate Parenthesis-{Medium} -{ Microsoft, Google}

//Given a balanced expression, find if it contains duplicate parenthesis or not. A set of parenthesis are duplicate if the same subexpression is surrounded by multiple parenthesis.

//Return a true if it contains duplicate else return false.
/* Eg :- (((a+(b)))+(c+d)) --> True, Duplicate
 * Eg :- ((((a) + (b))+c+d )) --> True, Duplicate
 * Eg :- ((a+b)+ (c+d))  --> False, No duplicate
 */

import java.util.*;

public class Tenth{
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                }else{
                    s.peek(); //opening pair
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){

        //valid string

        String str="((a+b))"; //true
        String str2="(a-b)";  //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}