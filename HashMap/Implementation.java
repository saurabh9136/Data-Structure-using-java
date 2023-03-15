package HashMap;
import java.util.*;

public class Implementation {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N; // size
        private LinkedList<Node> buckets[];// //N = bukets.length
        
        @SuppressWarnings("unchecked")
        public HashMap() {
             this.N = 4;
             this.buckets = new LinkedList[4];

             for(int i=0; i<4; i++) {
             this.buckets[i] = new LinkedList<>();
             }
        }


        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchinLL(K key, int bi) {
        
            LinkedList<Node> ll = buckets[bi];
            int di = 0 ;

            for(int i=0; i<ll.size(); i++) {
                Node node = ll.get(i);
                if(node.key == key) {
                    return di;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i=0; i<buckets.length; i++) {

                buckets[i] = new LinkedList<>();
            }

            // node add in bucket
            for(int i=0; i<oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // it returns bucket index
            int di = SearchinLL(key, bi); // it return the data index if valid then val else -1

            if(di != -1) { // valid

                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0) { // 2.0 is a threshHold value
                rehash(); 
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // it returns bucket index
            int di = SearchinLL(key, bi); // it return the data index if valid then val else -1

            if(di != -1) { // valid

                return true;
            } else {
                return false;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // it returns bucket index
            int di = SearchinLL(key, bi); // it return the data index if valid then val else -1

            if(di != -1) { // valid

                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // it returns bucket index
            int di = SearchinLL(key, bi); // it return the data index if valid then val else -1

            if(di != -1) { // valid

                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;    
            }
        }

        public ArrayList<K> KeySet() {

            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for( Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n ==0;
        }


    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 200);
        map.put("US", 50);
        map.put("UK", 70);

        System.out.println(map);
    }
    
}
