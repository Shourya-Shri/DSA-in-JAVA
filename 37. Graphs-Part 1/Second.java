/*
Graph Traversal:- In graphs we can take any node as starting point.

i) BFS - Go to immediate neighbour first.  --{Directly code in interviews}
==> We use queue data structure for this
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

        graph[0].add(new Edge(0,1,1));  //we can also remove the weight part completely,but here we just have given it as 1 in order to maintain standard.
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
    public static void bfs(ArrayList<Edge>[] graph){   //O(V+E)--n=Total nodes
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        
        /*Edge f=graph[0].get(0);
        q.add(f.src);*/
        q.add(0); //source=0. Though we can start from anywhere.

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    //DFS--> Keep going to 1st neighbour=> O(V+E)
    //We implement it in the form of Recursive function.

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
        bfs(graph); //0 1 2 3 4 5 6
        System.out.println();
        dfs(graph, 0, new boolean[V]); //0 1 3 4 2 5 6
    }
}
