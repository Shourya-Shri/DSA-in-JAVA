//Count of Nodesof a tree-- O(n)
//

import java.util.*;

public class Seventh {
     
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
    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int leftCount=count(root.left);
        int rightCount=count(root.right);

        return leftCount+rightCount+1;
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

        System.out.println(count(root2));
    }
}
 