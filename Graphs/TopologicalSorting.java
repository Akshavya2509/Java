package Graphs;

import java.util.*;

public class TopologicalSorting {
    // For directed and acyclic graphs only
    // Topological sorting is applied whereever we have dependency
    /*
     * Example: buy laptop, install OS, install IDE, install plugins, write code 
     * heer each step is dependent on previous step or maybe on some other but there is dependency
     * We use DFS for topological sorting 
     */
    static class edge{
        int src;
        int dest;

        public edge(int s, int d)
        {
            src = s;
            dest = d;
        }
    }

    static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0; i < graph.length; i ++)
        {
            graph[i] = new ArrayList<>();
        }

        
        graph[0].add(new edge(0, 2));
        // Vertex -> 1
        graph[1].add(new edge(1, 0));
        // Vertex -> 4
        graph[2].add(new edge(2, 3));
        // Vertex -> 3
        graph[3].add(new edge(3, 1));

        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));

        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));

    }

    public static void topSort(ArrayList<edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i ++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, stack);
            }
        }

        stack.push(curr);
    }

    public static void topoSortInitiator(ArrayList<edge> graph[], int V){
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < V; i ++){
            if(!vis[i]){
                topSort(graph, i, vis, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + "->");
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topoSortInitiator(graph, V);
    }

}
