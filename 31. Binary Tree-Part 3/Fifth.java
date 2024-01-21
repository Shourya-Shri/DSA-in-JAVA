//Kth ancestor of Node

//Minimum Distance between nodes-->O(n)
//=> Total numbers of edges between two node is called min distance

// Lowest Common Ancestor(Approach 2)--> O(n)

import java.util.*;

public class Fifth {
      
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
    public static int KAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDest=KAncestor(root.left, n, k);
        int rightDist=KAncestor(root.right, n, k);

        if(leftDest==-1 && rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDest,rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
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
        int n=4;
        int k=2;
        System.out.println(KAncestor(root2, n, k));
    }
}