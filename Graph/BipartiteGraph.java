package Graph;
import java.util.*;

public class BipartiteGraph {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));    
        graph[3].add(new Edge(3, 4));   

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {

        // 1st init all vertex with no color = -1
        int col[] = new int[graph.length];

        for(int i=0; i<col.length; i++) {
           col[i] = -1;
        }

        //BFS
        Queue<Integer> q= new LinkedList<>();
        //run a loop for graphs (including all graphs even not connected)
        for(int i=0; i<graph.length; i++) {
            q.add(0);
            col[0] = 0;

            while(!q.isEmpty()) {
                int curr = q.remove();
                for(int j=0; j<graph[curr].size(); j++) { //get neighbour
                    Edge e = graph[curr].get(j);
                    //case 1: curr or neighb color is same
                    if(col[curr] == col[e.dest]) {
                        return false;
                    } //case 2 neighb col is not assigned 
                    else if(col[e.dest] == -1) {
                       int nextCol = col[curr] == 0 ? 1:0; //if curr = 0 then next 1 else 0
                       col[e.dest] = nextCol;
                       q.add(e.dest);
                    } // case 3: when neighb color is diffrent continue : do nothing
                }
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println(isBipartite(graph));
    }
}
