/*
# Max/Min Segment Tree(Creation)
Given an arr[], we have to answer few queries:

a.) Output Max/Min for the sub-Array[i......j]
b.) Update the output at idx.
 */

public class Second {
    
    static int tree[];

    public static void initialise(int n){
        tree = new int[4*n];
    }
    public static void bildST(int i,int si,int sj,int arr[]){   //O(n)
        if(si==sj){
            tree[i]=arr[si];
            return;
        }
        int mid=(si+sj)/2;
        bildST(2*i+1,si, mid,arr);  //left subtree = 2*i+1
        bildST(2*i+2, mid+1,sj,arr);  //right subtree = 2*i+2
        
        tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
    }
    public static int getMax(int arr[],int qi,int qj){
        int n=arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);
    }
    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        if(si>qj || sj<qi){//no overlap
            return Integer.MIN_VALUE;
        }
        else if(si>=qi && sj<=qj){//no overalp
            return tree[i];
        }else{ //partial overalp
            int mid=(si+sj)/2;
            int leftAns= getMaxUtil(2*i+1,si,mid,qi,qj);
            int rightAns=getMaxUtil(2*i+2,mid+1,sj,qi,qj);
            return Math.max(leftAns,rightAns);
        }
    }
    public static void update(int arr[],int idx,int newval){
        arr[idx]=newval;
        int n=arr.length;
        updateUtil(0,0,n-1,idx,newval);
    }
    public static void updateUtil(int i,int si,int sj,int idx,int newval){
        if(idx<si || idx>sj){
            return;
        }
        tree[i]=Math.max(tree[i],newval);
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(2*i+1,si,mid,idx,newval);//left
            updateUtil(2*i+2,mid+1,sj,idx,newval);//right
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;

        initialise(n);
        bildST(0, 0, n-1, arr);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        int max=getMax(arr, 2, 5);
        System.out.println("max:  "+max);

        update(arr,2,20);
        max=getMax(arr,2,5);
        System.out.println("max:  "+max);
    }
}
