package Graph;
import java.util.*;
public class TopologicalSorting {

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
    
    public static void topSort(ArrayList<Edge>[] graph) {

        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st= new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                topSortUtil(graph, i, vis, st);
            }
        }
        
        while(!st.empty()) {
            System.out.print(st.pop()+" ");
        }
        System.out.println();
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> st) {

        vis[curr] = true;

        for(int i=0 ; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, st);
            }
        }
        st.push(curr);
    }
    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        topSort(graph);
    }
}