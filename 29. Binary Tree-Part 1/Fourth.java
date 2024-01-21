//Post-Order Traversal:-  O(1)
/* (i). Left SUbtree
  (ii). Right Subtree
 (iii). Root
 */

 import java.util.*;

 public class Fourth {
     
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
         public static void postorder(Node root){
             if(root==null){
                return;  // We could have also returned -1.
             }
             postorder(root.left);
             postorder(root.right);
             System.out.println(root.data + " ");
         }
     }
     public static void main(String args[]){
         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
 
         BinaryTree tree=new BinaryTree();
         Node root=tree.buildTree(nodes);
         
         tree.postorder(root);  //4,5,2,6,3,1
     }
 }
 