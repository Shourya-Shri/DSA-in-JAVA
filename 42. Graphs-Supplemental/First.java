/*
Strongly Connected Components(Kosaraju's Algorithm) //O(V+E)

=> SCC is a component in which we can reach every vertex of the component from every other vertex in that component.
=> It is found by using Kosaraju's Algorith(Based on DFS, not exactly).
=> To find Reverse DFS, we use Kosoraju's Algorithm

# Kosaraju's Algorith
# Kosaraju's Algorithm is a recursive algorithm to find strongly connected components in a directed graph.

Steps
1. get node in stack(topological sort) //O(V+E)
2. Transpose the graph
3. Do DFS according to stack nodes on the transpose graph.

=> When we reverse the direction of the edges of the graph it becomes a transpose graph.
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

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
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
    public static void kosaraju(ArrayList<Edge> graph[], int V){
        //step 1-get node in stack(topological sort) //O(V+E)
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s); //Modified DFS
            }
        }
        //step-2-> Transpose the graph(Reverse the direction of graph)
        ArrayList<Edge> transpose[]=new ArrayList[V];

        for(int i=0;i<graph.length;i++){
            vis[i]=false;

            transpose[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);  //e.src->e.dest
                transpose[e.dest].add(new Edge(e.dest,e.src));  //reverse
            }
        }
        //steps-3=> Do DFS according to stack nodes on the transpose graph.
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("SSC--> ");
                dfs(transpose,curr,vis);  //SCC
                System.out.println();
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){

        //visit
        System.out.print(curr + " ");
        vis[curr]=true;

        for(int i=0; i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void main(String args[]){

        /*
        1---->0--->3
        |     |    |
        |<--2<-    |->4
         */
        
        int V=5; //v=vertex

        ArrayList<Edge> graph[]=new ArrayList[V];

        creategraph(graph);
        kosaraju(graph, V);
    }
}
