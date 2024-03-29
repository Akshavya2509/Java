package Graphs;
import java.util.*;
public class BFS {
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

    public static void BFS(ArrayList<edge> [] graph, int start, boolean vis[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty())
        {
            int curr = q.remove();

            if(!vis[curr])
            {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i ++)
                {
                    edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;

        ArrayList <edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean visited[] = new boolean[v];

        for(int i = 0; i < v; i ++)
        {
            if(!visited[i])
            {
                BFS(graph, i, visited);
            }
        }
    }

}