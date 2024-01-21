/* 
Binary Search tree are an evolved version of binary trees as it searches with very less time complexity.
TC- O(H)....H=log(n)

* Inorder traversal of BST gives a sorted sequence

Strategy- Most problems will be solved using recursion i.e., by dividing into subproblems & making recursive calls on subtrees.
*/

public class First{

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
    public static void main(String args[]){
        int val[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }

        inorder(root);
        System.out.println();
    }
}