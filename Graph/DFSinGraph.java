package Graph;
import java.util.*;
public class DFSinGraph {
    //depth first approch
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w ;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
   
        graph[6].add(new Edge(6, 5, 1));
    }
    // this below function is use to trverse on graph when they are not connected to each other
    public static void dfs(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            dfsUtil(graph, i, visit);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit) {

        System.out.print(curr+" ");
        visit[curr] = true;

        //now get neighbour
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // now check if neighbour is already exist or not in visitor
            if(!visit[e.dest]) {
                dfsUtil(graph, curr, visit);
            }
        }       
    }

    public static void main(String[] args) {
        int v= 7;
      
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dfsUtil(graph, 0, new boolean[v]);
    }
    
}
