/*
# Trie Data Structure-> These data structure works on prefix that if we are given different words then rather than storing their prefix at different places, we store it on same.
=> These are also known as Retrieval trees because they are used for retrieval of data in same strings type of question.

Q.) What is a trie?

=>  K -ary tree<=> Bin(2)ary tree has 2 nodes, similary K-ary tree has k nodes.
=>  It has multiple pointers, that's why it is bulky. But it has good TC.
=>  Tries gives less time complexity because many of the nodes comes at the same levels and thus reduces the height.
=>  It gives optimised solution especially in question such as -(a) Searching, (b) prefix or suffix search & these types of queries in strings.
*/


//Creating a Trie.

import java.util.*;

public class First {
    
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

    public static void main(String args[]){

        String words[]={"the","a","there","their","any","the"};
    }
}
