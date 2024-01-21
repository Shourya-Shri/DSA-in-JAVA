// Diameter of a Tree(Approach 1)--O(n^2)
//=> Diameter is defined as the number of nodes in the longest path between 2 leaves.
//=> For any tree,diameter can go through its root or can lie in its any Subtree
//=> Approach 1-> (a) Diameter passes through root." Diam=(lh+rh+1)"

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
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int leftHt=height(root.left);

        int rightDiam=diameter(root.right);
        int rightHt=height(root.left);

        int selfDiam=leftHt+rightHt+1;

        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
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

        System.out.println(diameter(root2));
    }
}
 