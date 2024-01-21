/*
# Disjoint Set DS (Union find DS):-

To store and track, non-overlapping sets.

n=8,   Find  grp1(set 1):  1->2->3->4,  grp2(set 2):  5->6->7->8
       Union

find(2)--Set 1  --TC -O(4k)=Constant
find(5)--Set 2

*/

public class Third {

    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return find(par[x]);  // return par[x]=find(par[x]);  --> Optimised
    }
    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }else{
            par[parB]=parA;
        }
    }
    public static void main(String args[]){
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
    }
}
