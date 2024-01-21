/*
# Bellaman Ford Algorithm=> Shortes paths from the source to all vertices(negative edges). {It is DP based and bellman ford was greedy based}
=> Dijkstra's doesn't generate when edges are negative.
=> Dijkstras is greedy based and Bellaman Ford is based on DP.
=> Time Complexity is much.

This algorithm says, perform this operation V-1 times.

Q.) Why only v-1 time ?
=> So, that we can check our longest iteration that if our answer is present in that or not.

It doesn't work for negative weight cycle(sum of weights of any cycle present in the graph is negative,then) because due to negative, it will keep going negative & will never get the answer(it doesn't make sense).
*/


import java.util.*;

public class First {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));  
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));
        
        graph[4].add(new Edge(4,1,-1));
    }
    public static void bellamanFord(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        int V=graph.length;

        //algo
        for(int i=0;i<V-1;i++){ //Edges-O(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    //Relaxation Step
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
       
        int A=5; //v=vertex

        // int arr[]=new int[V];
        ArrayList<Edge> graph[]=new ArrayList[A];

        creategraph(graph);
        int src=0;
        bellamanFord(graph, src);
    }
}
