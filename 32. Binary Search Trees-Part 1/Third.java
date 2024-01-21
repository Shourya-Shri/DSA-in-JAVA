//Delete a Node- {Very Important}- Adobe
/*
Case 1:- No child(leaf Node)=> Delete Node & Return null to parent.

Case 2:- One Child => Delete Node & replace with child node.

Case 3:- Two Children -{Important}=> Replace value with inorder successor & delete the node for inorder successor.

// Inorder Successor in BST=> Left Most in right Subtree.(Min value in right subtree)
   Inorder Successor always has 0 or 1 child.

*/

public class Third {
    
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
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.left,val);
        }
        else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{
            //case-1(leaf node)
            if(root.left==null && root.right==null){
                return null;
            }
            //case -2(Single child)
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case-3(both children)
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int val[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }

        inorder(root);
        System.out.println();

        root=delete(root,1);
        System.out.println();
        inorder(root);
    }
}
