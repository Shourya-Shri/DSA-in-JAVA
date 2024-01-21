//Mirror a Bst

public class Seventh {
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
    public static Node CreateMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=CreateMirror(root.left);
        Node rightMirror=CreateMirror(root.right);

        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        int val[]={8,5,3,6,10,11};
        Node root=null;

        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }

        preorder(root);
        System.out.println();

        root=CreateMirror(root);
        preorder(root);
    }
}
