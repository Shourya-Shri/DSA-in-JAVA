/*
Very important concept-Topic
# Topological Sorting(Using BFS)  //O(V+E); Sc-O(V)
In-Degree(In-Coming edges of a node)
Out-Degree(Out-Coming edges of a node)

=> A DAG has atleast one vertex with in degree 0 and one vertex with out degree 0.

Firstly we put out the node of 0 in degree.
*/

import java.util.*;

public class First{

    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void calcIndeg(ArrayList<Edge> graph[],int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;  //vertex
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[]=new int[graph.length];
        calcIndeg(graph,indeg);  //calculate in degree

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        /*        
                5-----> 0 <------4
                |       |        |
                |->2--->3--->1-<-|
               
                    
        */
        int V=6; //v=vertex

        // int arr[]=new int[V];
        ArrayList<Edge> graph[]=new ArrayList[V];

        creategraph(graph);
        topSort(graph);

    }
}
