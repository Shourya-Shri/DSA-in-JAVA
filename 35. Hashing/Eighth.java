/*
# Valid Anagram-> Words which are rearranged of each others(ab<->ba)

Given two strings S and t, return true if t is an anagram of s, and false otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
s="race", t="caee"=> True
s="heart",t="earth"=> True
*/

import java.util.*;

public class Eighth{

    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args){
        String s="race";
        String t="care";
        System.out.println(isAnagram(s,t));
    }
}