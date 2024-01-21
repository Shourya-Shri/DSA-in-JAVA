//Kth Level of a Tree- O(n)
/* Two ways"-
   (i) Iterative Approach--> It can be solved using level order traversal
  (ii) Recursive Approach -- We will use this here
 */

import java.util.*;

public class First {
     
    static class Node{
        int data;
        Node left;
        Node right;
 
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void Klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data);
            return;
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);
    }
    
    public static void main(String args[]){
        /* 
                        1
                       / \
                      2   3
                     / \  / \
                    4   56   7
        */

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);
        root2.left.left=new Node(4);
        root2.left.right=new Node(5);
        root2.right.left=new Node(6);
        root2.right.right=new Node(7);

        int k=2;
        Klevel(root2,1,k); //here 1 is that we are starting with level 1.
    }
}
 