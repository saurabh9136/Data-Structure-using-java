package Graph;

public class DisjointSet {

    static int n = 7;
    static int[] parent = new int[n];
    static int[] rank = new int[n];

    public static void init() {
       for(int i=0; i<n; i++) {
           parent[i] = i; //init all elements parent
       }
    }

    public static int find(int x) {
        if(x == parent[x]) {
            return x;
        }
        // Path compression optimisation 
        return  parent[x]=find(parent[x]); // it recursively change all current parent value with supreme parent value
    }

    public static void union(int a, int b) {
        
        int parA= find(a);
        int parB = find(b);
        // case 1 
        if(rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;

        } else if(rank[parA] < rank[parB]) { // case 2
            parent[parA] = parB;
        } else { // case 3
            parent[parB] = parA;
        }

    }

    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
    
}
