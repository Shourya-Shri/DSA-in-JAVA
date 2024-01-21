/*
Very important concept-Topic
# Topological Sorting(Using DFS)  //O(V+E); Sc-O(V)
=> Directed Acyclic graphs(DAG) is a directed graph with no cycles. Topological Sorting is used only for DAG's(not for non-dags).
=> It is a linear order of vertices such that every directed edge u->v,the vector u comes before v in the order.

=> It means the work which has dependency on others has to be done first.
*/

import java.util.*;

public class Fifth{

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

        graph[3].add(new Edge(5,0));
        graph[3].add(new Edge(5,2));
    }
    public static void topSort(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s); //Modified DFS
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){

        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
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
