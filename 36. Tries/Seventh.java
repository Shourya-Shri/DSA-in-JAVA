/*
# Longest word with all Prefixes{Q2 of practice question}

=> Find the longest string in words such that every prefix of it is also in words.
words[]=["a","banana","app","appl","ap","apply","apple"];
ans=apple;

Note:- apple and apply both are answers but lexicographically apple is smaller so it is the answer.

Prefix- Whenever hear this,think of Tries first.
*/

public class Seventh {
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
    
    public static String ans="";
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
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);

                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1); //backtrack
            }
        }
    }
    public static void main(String args[]){

        String words[]={"a","banana","app","appl","ap","apply","apple"};
        
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
