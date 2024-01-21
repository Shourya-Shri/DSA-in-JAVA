//Diameter of a tree-2nd approach--> O(n)
//=> Here, we'll make info class to store information of height and diameter and due to this the time complexity is reducing.


import java.util.*;

public class Second {
     
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
    static class Info{
        int dim;
        int ht;

        public Info(int dim,int ht){
            this.dim=dim;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.dim,rightInfo.dim),leftInfo.ht+rightInfo.ht+1);

        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);
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

        System.out.println(diameter(root2).dim);
    }
}
 