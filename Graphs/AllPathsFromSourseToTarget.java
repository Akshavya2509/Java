package Graphs;

import java.util.ArrayList;

public class AllPathsFromSourseToTarget {
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

        
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));
        // Vertex -> 1
        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));
        // Vertex -> 4
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));
        // Vertex -> 3
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));

        // Vertex -> 4
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));
        // Vertex -> 5
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));
        graph[5].add(new edge(6, 5, 1));
    }
    public static void dfs(ArrayList <edge>[] graph, int curr, boolean vis[], String path, int target)
    {
        if(curr == target)
        {
            System.out.println(path);
            return;
        }

        for(int i = 0; i < graph[curr].size(); i ++)
        {
            edge e = graph[curr].get(i);
            if(!vis[e.dest]) // If the neighbour is already visited then don't
            {
                vis[curr] = true;
                dfs(graph, e.dest, vis, path+e.dest, target);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;

        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int src = 0, target = 6;
        dfs(graph, src, new boolean[v], "0", target);
    }

}
