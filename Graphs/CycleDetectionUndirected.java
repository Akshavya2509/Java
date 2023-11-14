package Graphs;

import java.util.ArrayList;

public class CycleDetectionUndirected {
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

        
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 4));
        // Vertex -> 1
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        // graph[1].add(new edge(1, 4));
        // Vertex -> 4
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));
        // Vertex -> 3
        graph[3].add(new edge(3, 2));
        //Vertex -> 4
        graph[4].add(new edge(4, 0));
        // graph[4].add(new edge(4, 1));
        graph[4].add(new edge(4, 5));
        //Vertex -> 5
        graph[5].add(new edge(5, 4));

    }

    public static boolean isCycleDetected(ArrayList<edge> graph[], boolean vis[], int curr, int parent){
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i ++){
            edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != parent)
                return true;
            else if(!vis[e.dest]){
                if(isCycleDetected(graph, vis, e.dest, curr))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

       boolean ans = isCycleDetected(graph, new boolean[V], 0, -1);

       System.out.println(ans);

    } 
}
