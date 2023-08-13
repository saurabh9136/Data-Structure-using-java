package Graph;
import java.util.*;

public class AdjencentiveList {

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
    public static void main(String[] args) {
        // we use array of array list to create a graph of list of lists

        int v = 5; // v= vertex which is size of arrau
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v]; // array of arrayList
        // now all values are init with null value so we need to change it 
        for(int i=0; i<v; i++) {
            graph[i] = new ArrayList<>(); //now every cell of i contains the arrayList which store the neighbour value 
        }

        //vertex 0
        graph[0].add(new Edge(0, 1, 5)); //src, dest, wt

        //vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //vertex 4
        graph[4].add(new Edge(4, 2, 2));

        // if we need to print neighbour of 2nd vertex
        for(int i=0; i<graph[1].size(); i++) { // now all values are stored int graph
             Edge e = graph[1].get(i);
            //neighbours are = destination of vertex
            System.out.println(e.dest);
        }        
        //time complexity = O(constant)
    }
}
