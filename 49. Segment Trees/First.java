/*
# Segment Trees Introduction
=> Segment trees are the special trees data structure which is used to find Range Queries. Eg:-arr[1,2,3,4,5]: i=1 to i=3

# Why do we need segment trees?

 Segment trees are the trees in DS which stores same values as arrays to minimise the time of range queries in arrays.

 It uses divide and conquer approach.

Total level =  log2^n

Total nodes = 2n-1    (But just in code, we take nodes as =4*n just for safety because our segment trees is full Binary trees & so that we don't get sort of spaces.)

*/

/*
Construct==> O(n)
Query ==> O(logn)
Update ==> O(logn)
 */

public class First {
    
    static int tree[];

    public static void initialise(int n){
        tree = new int[4*n];
    }
    public static int bildST(int arr[],int i,int start,int end){
        if(start==end){
            tree[i]=arr[start];
            return tree[i];
        }
        int mid=(start+end)/2;
        bildST(arr, 2*i+1, start, mid);  //left subtree = 2*i+1
        bildST(arr, 2*i+2, mid+1, end);  //right subtree = 2*i+2
        tree[i]=tree[2*i+1]+tree[2*i+2];

        return tree[i];
    }
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if(qj<=si || qi>=sj){   //Non Overalpping
            return 0;
        }
        else if(si>=qi && sj<=qj){   //Complete Overalap
            return tree[i];
        }else{
            int mid=(si+sj)/2;
            int left= getSumUtil(2*i+1,si,mid,qi,qj);
            int right=getSumUtil(2*i+2,mid+1,sj,qi,qj);
            return left+right;
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumUtil(0,0,n-1,qi,qj);
    }
    // # Update on ST:-
    // To change an array is very simple but now we have to update the segment tree also.
    public static void UpdateUtil(int i,int si,int sj,int idx,int diff){   //O(logn)
        if(idx>sj || idx<si){
            return;
        }
        tree[i]+=diff;
        if(si!=sj){ //Non-leaf
            int mid=(si+sj)/2;
            UpdateUtil(2*i+1, si, mid, idx, diff);
            UpdateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }
    public static void update(int arr[],int idx,int newVal){
        int n=arr.length;
        int diff=newVal - arr[idx];
        arr[idx]=newVal;

        UpdateUtil(0, 0, n-1, idx, diff);  //Segment tree updation
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        initialise(n);
        bildST(arr,0,0,n-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println(getSum(arr, 2, 5));

        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
    }
}
