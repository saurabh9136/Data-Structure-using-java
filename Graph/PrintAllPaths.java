package Graph;
import java.util.*;
public class PrintAllPaths {
    static class Edge {
        int src; 
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0 ; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
  
        graph[2].add(new Edge(2, 3));    
        
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void pritnPath(ArrayList<Edge>[] graph, int src, int dest, String path) {
        if(src == dest) {
            System.out.print(path+dest+" ");
        }

        for(int i=0; i<graph[src].size(); i++) {            
            Edge e = graph[src].get(i);
            pritnPath(graph, e.dest, dest, path+src);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
         int src = 5, dest =1;
         pritnPath(graph, src, dest, "");
    }
}
