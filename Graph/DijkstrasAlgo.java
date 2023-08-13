package Graph;
import java.util.*;

public class DijkstrasAlgo {
    static class Edge {
        int src; 
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0 ; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{

        int node;
        int path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2) {//on the basis of shortest path
            return this.path - p2.path;
        }
    }

    public static void dijkstras(ArrayList<Edge>[] graph, int src) {
        int dis[] = new int[graph.length];
        for(int i=0; i<dis.length; i++) {
           if(i != src) {
            dis[i] = Integer.MAX_VALUE; //init with +infinity
           }
        }

        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.node]) {
                vis[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);

                    // now get all elements
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    //Dijkastras Algorithm
                    if(dis[u]+wt < dis[v]) {
                        dis[v] = dis[u]+wt;
                        pq.add(new Pair(v, dis[v]));
                    }
                }
            }
        }

        for(int i=0; i<dis.length; i++) {
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        dijkstras(graph, 0);
    }

}
