package AdvancedDSA;

import java.util.*;

public class GRAPH_DFS_WGB{
    static class edge{
        int src;
        int dest;
        int wt;
        char color;

        public edge(int s, int d, int w, char c)
        {
            src = s;
            dest = d;
            wt = w;
            color = c;
        }
    }
    private static void createGraph(ArrayList<edge> graph[])
    {
        for(int i = 0; i < graph.length; i ++)
        {
            graph[i] = new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        ArrayList <edge> graph[] = new ArrayList[v];

        createGraph(graph);
    }
}