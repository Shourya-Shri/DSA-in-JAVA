// Lowest Common Ancestor(Approach 1)--> O(n)

//Kth Level of a Tree- O(n)
/* Two ways"-
   (i) Iterative Approach--> It can be solved using level order traversal
  (ii) Recursive Approach -- We will use this here
 */

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
     public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundRight=getPath(root.right,n,path);

        if(foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
     }
     public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //Last Common Ancestor
        int i=0;

        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //last equal node->i-1th

        Node lca=path1.get(i-1);
        return lca;
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
         int n1=4;
         int n2=5;
         System.out.println(lca(root2, n1, n2).data);
     }
 }
  