//Sorted array to balanced BST-O(n)

//Balanced bst is one which has minimum possible height.

public class First {
        static class Node{
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data=data;
            }
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
        public static Node CreateBST(int arr[],int st,int end){
            if(st>end){
                return null;
            }
            int mid=(st+end)/2;
            Node root=new Node(arr[mid]);
            root.left=CreateBST(arr, st, mid-1);
            root.right=CreateBST(arr, mid+1, end);
            return root;
        }
        public static void main(String args[]){
            int arr[]={3,5,6,8,10,11,12};
    
            Node root=CreateBST(arr,0,arr.length-1);
            preorder(root);
        }
}
