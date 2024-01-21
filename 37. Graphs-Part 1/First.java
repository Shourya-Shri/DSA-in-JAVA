/*
Graphs:- -{ 1 of 3 Mostly asked topics}

1. It is a netwok of nodes.
2. It can be assumed as the parent version of tree.

# Types of graphs(based on edge):-

1. Directed Graphs :-

a) Uni-Directional
b) Un-Directed(Bi-directional)

2. Weighted graphs
3. Unweighted graphs
=> Weight value can be negative, 0 and anything.
*/

/*
# Graphs Representation:-

1. Adjacency List{Common & Efficiency}:-
=> It can be of ArrayList<ArrayList> or Arrays<ArrayList>.

2.Adjacency Matrix:-
=> Stores 0 and 1 on matrix when not connected and connected respectively.(On un-weighted)
=> If graph is weighted then we would store weight rather than 1.

Q.) Why we don't prefer Adjacency Matrix?
=> It consume lots of space(0's are extreme)-O(V^2)-space,V=vertex
=> Difficulty in finding neighbour.

3. Edge List:-
=> It can be implemented in the form of ArrayList,LinkedList.

Q.) Why to use this?
=> We prefer in questions where we need to sort the edges.

4. Implicit Graphs:-
=> In this, we are given 2-D array and we visualize it as a graph with its 4 neighbours.
*/


// # Creating a graph(Adjacency List)

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
    public static void main(String args[]){
        /*        0-----1
                       / \
                      /   \
                     2-----3
                     |
                     4
        */
        int V=5; //v=vertex

        // int arr[]=new int[V];
        ArrayList<Edge> graph[]=new ArrayList[V]; //Here at every single index null value is stored(means it is not defined what is stored here)

        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>(); // Here we are making it empty arralist.
        }
        //for 0 vertex at oth index
        graph[0].add(new Edge(0,1,5));

        //for 1 vertex at 1st index
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //for 2 vertex at 2nd index
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //for 3 vertex at 3rd index
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        
        //for 4 vertex at 4th index
        graph[4].add(new Edge(4,2,2));

        //2's neighbours

        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.src+"->"+e.dest+" ");
        }
    }
}
