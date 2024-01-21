//Subtree of another tree

//=> Given the roots of two binary tree root and subroot, return true if there is a subtree of root with the same structure and node values of subroot and false otherwise


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

    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        boolean left=isSubtree(root.left,subroot);
        boolean right=isSubtree(root.right,subroot);
        return left||right;
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

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        /* 
                    
                      2 
                     / \ 
                    4   5
        */

        System.out.println(isSubtree(root2,subroot));
    }
}
 