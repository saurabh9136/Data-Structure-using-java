package Graph;
import java.util.*;
// detect cycle using BFS
public class CycleInGraph {
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
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static boolean detetctCycle(ArrayList<Edge>[] graph) {
        boolean[] visit = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(!visit[i]) {
                if(detectCycUtil(graph, visit, i, -1)){
                    return true;
                }
            }   
        }
        return false;
    }

    public static boolean detectCycUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        // same as dfs
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case 3 : vertex not visit
            if(!vis[e.dest]) {
                if(detectCycUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }

            //case 1 when curr visited but parent not
            else if(vis[e.dest] && e.dest != par) {
                return true;
            }
            //case 2: do nothing because of loop, it will continue
        }
        return false;
    }

    public static void main(String[] args) {
        int v= 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println(detetctCycle(graph));


    }


}
