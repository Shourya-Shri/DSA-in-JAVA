/*
# Krushkal's Algorithm  -- O(V+ E logE)
=> It is also used for finding MST but  it uses greedy approach.

Approach:-
1. Sort edges
2. Take minimum cost edge which does not form cycle and include them in answer.
*/

import java.util.*;

public class Fourth {
    
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt-e2.wt;
        }
    }
    static void CreateGraph(ArrayList<Edge> edges){
        //Edges
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }
    static int n=4;
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
        return par[x]=find(par[x]);
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
    public static void KrushkalsMst(ArrayList<Edge> edges,int v){

        init();
        Collections.sort(edges);  // Sort edges in ascending order=> O(E logE){Only this}

        int mstCost=0;
        int count=0;

        for(int i=0;count<v-1;i++){  //O(v)
            Edge e=edges.get(i);

            //src,dest,wt

            int parA=find(e.src);
            int parB=find(e.dest);

            if(parA!=parB){  //Not cycle condition
                union(e.src,e.dest);
                mstCost+=e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }
    public static void main(String args[]){
        int v=4;
        ArrayList<Edge> edges=new ArrayList<Edge>();
        CreateGraph(edges);
        KrushkalsMst(edges, v);
    }
}
