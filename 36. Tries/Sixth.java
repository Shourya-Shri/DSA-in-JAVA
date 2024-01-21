/*
# Count unique Substring--{Microsoft,Google}

=> Given a string of length n of lowercase alphabet character, we need to count total number of distinct substrings of this string.
str="ababa"
ans=10  ==> a,ab,aba,abab,ababa =5
            b,ba,bab,baba,""    =5
            a,ab,aba            =0
            b,ba                =0
            a                   =0
            Total = 10

=> All prefix of all suffix = All suffix of all prefix.
=> Unique Substring = All unique prefix of all suffix = All unique suffix of all prefix.

Approach:-
1. Find all suffix of string. //str.substring(i)
2. Create TRIE + insert.
3. Count nodes of trie==> Unique prefix=unique substrings.
*/

public class Sixth {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

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
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){

        String str="ababa"; //ans=10
        //Suffix-> insert in trie
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
