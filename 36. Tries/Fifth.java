/*
# StartsWith Problem:-
=>Create a function boolean starts with(String prefix) for a trie. Returns true if there is a previously inserted string word that has the prefixx, and false otherwise.

Words[]={"apple","app","mango","mom","woman"};

prefix="app"    output:true
prefix="moon"   output:false
*/

public class Fifth {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node(); 

    //insert
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;;
    }
    public static boolean startswith(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;  //It's almost same as simple searching.Just we don't have to check the last true condition.
    }
    public static void main(String args[]){

        String arr[]={"zebra","dog","duck","dove"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        root.freq=-1;
    }
}
