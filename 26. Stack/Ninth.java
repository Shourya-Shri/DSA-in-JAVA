/* Valid Parenthesis :-
Given a string s containing just the characters '(' ,')' , '{','}' , '[' and ']' , determine if the input string is valid.

An input string is valid if:-
i)  Open brackets must be closed by the same type of brackets.
ii) Open brackets must be closed in the correct order.
iii) Every close bracket has a cooresponding open brackets of the same type.
s="()[]{}"-- Correct   
s="(]" --Incorrect
s="()" --correct
s=")(" -- Incorrect

*/

// It can be solve in many ways but we'll solve it using stack.

import java.util.*;

public class Ninth{
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){ //Opening
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') //()
                   ||(s.peek()=='{' && ch=='}') //{}
                   ||(s.peek()=='[' && ch==']')) // []
                   {
                    s.pop();
                   }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String str="({})[]"; //true
        System.out.println(isValid(str));
    }
}