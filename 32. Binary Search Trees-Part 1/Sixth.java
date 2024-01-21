//Validate BST-{Amazon,Facebook,Snapdeal}

//Approach-1=> Compare with left & right node

//If inorder traversal of any Bst is sorted then it is said to be a valid binary search tree.

/* 
Approach 2=> Check if max value in left subtree < node & min value in right subtree > node
 */

public class Sixth {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }else{
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, max) && isValidBST(root.right, min, max);
    }
    public static void main(String args[]){
        int val[]={8,5,3,6,10,11,14};
        Node root=null;

        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }

        inorder(root);
        System.out.println();

        if(isValidBST(root,null,null)){
            System.out.print("Valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
