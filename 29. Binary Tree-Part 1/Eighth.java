// Sum of Nodes---> O(n)
// It can be solved with 2 approach-> (i) LevelOrder Approach (ii) Recursion Approach

//We will solve using recusrive approcah

import java.util.*;

public class Eighth {
     
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
    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int leftsum=sum(root.left);
        int rightsum=sum(root.right);

        return leftsum+rightsum+root.data;
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

        System.out.println(sum(root2));
    }
}
 