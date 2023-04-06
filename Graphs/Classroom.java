package Graphs;
import java.util.*;
public class Classroom {

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
    public static void main(String[] args) {
        
        int v = 5;

        ArrayList<edge>[] graph = new ArrayList[v]; // Array of ArrayList
        //Similar to arr[] = new arr[n];

        for(int i = 0; i < v; i ++)
        {
            graph[i] = new ArrayList<>();
        }

        // Vertex -> 0

        graph[0].add(new edge(0, 1, 5));

        // Vertex -> 1
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));

        // Vertex -> 2

        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 2));

        // Vertex -> 3

        graph[3].add(new edge(3, 1, 3));
        graph[3].add(new edge(3, 2, 1));

        // Vertex -> 4
        graph[4].add(new edge(4, 2, 2));

        //2's Neigbours

        for(int i = 0; i < graph[2].size(); i ++)
        {
            edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
