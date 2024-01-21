//Height of a tree-- O(n)
//// Max among left & right +1 gives height of node.

import java.util.*;

public class Sixth {
     
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
    static class BinaryTree{
        static int idx=-1;
 
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
 
            return newNode;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }

            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
 
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
         
        System.out.println(tree.height(root)); // Method 1
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

        System.out.println(height(root2));
        System.out.println(height(root));
    }
}
 