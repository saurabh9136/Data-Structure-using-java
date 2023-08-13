package Graph; 
import java.util.*;

public class CheapestFlight {
    static  class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int flights[][]) {
        
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++) {
           int src = flights[i][0];
           int dest = flights[i][1];
           int wt = flights[i][2];

           Edge e = new Edge(src, dest, wt);
           graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlights(int flights[][], int src, int dest, int k, int n) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flights);

        int dis[] = new int[graph.length];
        for(int i=0; i<dis.length; i++) {
            if(i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops > k) {
                break;
            }

            //check for neighbours
            for(int i=0; i<graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);

                // dijkstras Algorithm
                //int u = e.src;
                int v = e.dest;
                int w = e.wt;

                if(curr.cost != Integer.MAX_VALUE && curr.cost + w < dis[v] && curr.stops <= k) {
                    dis[v] = curr.cost+w; //relaxsation
                    q.add(new Info(v, dis[v], curr.stops+1));
                }
            }
        }

        if(dis[dest] == Integer.MAX_VALUE) {
            return -1; //no route exist
        } else {
            return dis[dest];
        }
    }

    public static void main(String[] args) {
        int n= 4;
        int flights[][] = {{0,1,1}, {1, 2, 1}, {0, 2, 5}, {2, 3, 1}};
        int src= 0, dest = 3, k = 1;

        System.out.println(cheapestFlights(flights, src, dest, k, n));
    }
}
