package Graph;
import java.util.*;

public class TopSortInDegree {
    static class Edge {
        int src; 
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void calinDegree(ArrayList<Edge>[] graph,int inDegree[] ) {

        for(int i=0; i<graph.length; i++) {
            int vertex = i; //not necessary

            for(int j=0; j<graph[vertex].size(); j++) {
                Edge e= graph[vertex].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph) {
        int inDeg[] = new int[graph.length];
        calinDegree(graph, inDeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<inDeg.length; i++) {
            if(inDeg[i] == 0) {
                q.add(i);                
            }
        }

        // BFS
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");

            // call for neighbours
            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                inDeg[e.dest]--;
                if(inDeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
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

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);

        topSort(graph);
    }


}
