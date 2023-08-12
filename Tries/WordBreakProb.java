package Tries;

public class WordBreakProb {
    static class Node {
        Node child[] = new Node[26];
        boolean eow = false; // eow = end of word

        Node() { //constructor
            for( int i=0; i<26; i++) { //init all array as null value
                child[i] = null;
            }
        }
    }

    static Node head = new Node(); //init head

    public static void insert(String word) {

        Node curr = head; //init head node as root node 

        for(int level =0; level<word.length(); level++) {

            int idx = word.charAt(level) -'a'; //return index of word
            if(curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }

            // now update the value of curr to treverse level wise
            curr = curr.child[idx];
        }

        // after above loop we are standing on last word so we need to init eod as T
        curr.eow = true;

    }

    public static boolean search(String key) {

        Node curr = head;

        for(int level=0; level < key.length(); level++) {

            int idx = key.charAt(level) - 'a';

            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key) {

        if(key.length() == 0 ){
            return true;
        }

        for(int i=1; i<=key.length(); i++) {
           if(search(key.substring(0, i)) && wordBreak(key.substring(i))) {
               return true;
           }
        }

        return false;
    }
    public static void main(String[] args) {
        
        String word[]= {"i", "like", "sam", "samsung", "mobile", "ice"};

        for(int i=0; i<word.length; i++) {
            insert(word[i]);
        }

        System.out.println(wordBreak("iliesam"));
    }
    
}
