package Graph;
import java.util.*;
// is cyclic or not
public class QuestionSolv {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
      graph[0].add(new Edge(0, 1));

      graph[1].add(new Edge(1, 2));

      graph[2].add(new Edge(2, 0));
      graph[2].add(new Edge(2, 3)); 
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {

        boolean vis[] = new boolean[graph.length];        
        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
             if(isCycleutil(graph, vis, i, -1)) {
                 return true;
             }
            }
        }   
        
        return false;
    }

    public static boolean isCycleutil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        // vis 
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
           
            Edge e = graph[curr].get(i); // get the neighbour detail
            // case 1 : visit the beighbour because that is not visited
            if(!vis[e.dest] ) {
                if(isCycleutil(graph, vis, e.dest, curr)) {
                    return true;
                }              
            }// case 2 : when neighbour vis but par not
            else if(vis[e.dest]  && e.dest != par) {
                return true;
            }
            // case 3: neighbour or parent both visited continue
        }
        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[10];
        createGraph(graph);

        System.out.println(isCycle(graph));
    }
    
}
