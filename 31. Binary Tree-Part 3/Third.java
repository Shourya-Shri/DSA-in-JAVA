// Lowest Common Ancestor(Approach 2)--> O(n)

import java.util.*;

public class Third {
      
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
    public static Node lca2(Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);

        //leftlca=val rightlca=null
        if(rightlca==null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
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
        int n1=4;
        int n2=5;
        System.out.println("Ancestor" + lca2(root2, n1, n2).data);
    }
}
  