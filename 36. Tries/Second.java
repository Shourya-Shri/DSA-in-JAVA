//Insert in Trie-O(L)L-> Length of largest string -{Microsoft,Google,Amazon,D-Show,Searchig}
//Searching-O(L)

import java.util.*;

public class Second {
    
    static class Node{
        Node children[]=new Node[26];   //If we store any node on index 0, it means we have store "a" & similary it goes on & on.
        boolean eow=false;  //end of word

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node(); //Root of trie is always empty so that from next level we can store data of the children.

    //insert
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;;
    }
    //Searching
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }
    public static void main(String args[]){

        String words[]={"the","a","there","their","any","thee"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("the"));
        System.out.println(search("thor"));
    }
}