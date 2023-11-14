package Graphs;

import java.util.*;
public class CycleDetectionDirected {
    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w)
        {
            src = s;
            dest = d;
            wt = w;
        }
    }

    static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0; i < graph.length; i ++)
        {
            graph[i] = new ArrayList<>();
        }

        
        graph[0].add(new edge(0, 2, 1));
        // Vertex -> 1
        graph[1].add(new edge(1, 0, 1));
        // Vertex -> 4
        graph[2].add(new edge(2, 3, 1));
        // Vertex -> 3
        graph[3].add(new edge(3, 0, 1));

    }

    public static boolean isCycleDetected(ArrayList<edge> graph[], boolean vis[], int curr, boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for(int i = 0; i < graph[curr].size(); i ++){
            edge e = graph[curr].get(i);
            if(rec[e.dest])
                return true;
            else if(!vis[e.dest]){
                if(isCycleDetected(graph, vis, e.dest, rec))
                    return true;
            } 
        }

        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];

        for(int i = 0; i < V; i ++){
            if(!vis[i]){
                System.out.println(isCycleDetected(graph, vis, i, rec));
                break;}
        }

    }
}

