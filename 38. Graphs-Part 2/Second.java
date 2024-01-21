/*
# Cycle detection(Undirected graph)-DFS
=> We'll use modified DFS code to find that.

The node through which you come to a node is called as parent node.
*/

import java.util.*;

public class Second {

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

        graph[0].add(new Edge(0,1,1)); 
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,2));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }

    public static boolean detectcycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){  // -1 for starting node as it does not has any parent.
                    return true;// cycle exists in any part.
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[],int curr,int par){

        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            //case 3 not visted, so vist.
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            //case 1--> neighbour visited but not parent
            else if(vis[e.dest] && e.dest !=par){
                return true;
            }
            //case 2--> (neighbour also visited and it is parent also) do nothing continue-> loop
        }
        return false;
    }
    public static void main(String args[]){
        /*        
                1-----3
               /      | \
              0       |  5--6
               \      | /
                2-----4
        */
        int V=7; //v=vertex

        // int arr[]=new int[V];
        ArrayList<Edge> graph[]=new ArrayList[V];

        creategraph(graph);
        System.out.println(detectcycle(graph));
    }
}