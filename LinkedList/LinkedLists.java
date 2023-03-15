package LinkedList;
public class LinkedLists {

    public static class node{

        int data; // intitalizing data into node
        node next; // then pointing to another class(node)
        // constructor
        public node(int data){
         this.data = data;
         this.next = null;

        }
    }
    public static node head;
    public static node tail;
    static int size;

    public void addFirst(int data) {
        // first create new node
        node NewNode = new node(data);
        size++;
        if(head == null){
            head = tail = NewNode;
            return;
        }
        // points this class to head
        NewNode.next=head;

        // last make this node as a head node
        head = NewNode;
    }

    public void addLast(int data){
        // create new node
        node NewNode = new node(data);
        size++;
        if(head == null){
            head = tail= NewNode;
            return;
        }
        // point tail to this node as new tail

        tail.next = NewNode;
        // new make this node as a tail
        tail = NewNode;
    }

    public void printNode(){
        // intialize temo from head
        node temp = head;
        if(head == null){
            System.out.println("ll is empty");
            return;
        }

        while(temp != null){
            // first print the data
            System.out.print(temp.data+"->");
            // arrow points to another node
            // next traverse the temp to another node
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add node into middle of chain
    public void addMiddle(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        // create new node
        node Newnode = new node(data);
        size++;

        node temp = head;
        int i = 0; // to traverse on indeax
        while(i < index-1){
            // now increment temp as well as the i 
            temp = temp.next;
            i++;
        }
        // now we reached to index -1
        Newnode.next = temp.next;
        temp.next = Newnode;
    }

    public int removeFirst(){
        if(size == 0){
            
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
           head = tail= null;
           size = 0;
           return val;
        }
        // get the data from node
        int value = head.data;
        size--;
        // now ponts head to another node
        head = head.next;
        // return the value
        return value;
    }

    public int removeLast(){
        if(size == 0 ){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
          int val = head.data;
          head = tail= null;
          size = 0;
          return val;          
        }
        node prev = head;
       for(int i=0; i<size-2; i++){
           prev = prev.next;
       }

       int val = prev.next.data; // tail.data
       prev.next = null;
       tail = prev;
       size--;
       return val;
    }

    public int iterSearch(int key){

        node temp = head;
        int i = 0;

        while(temp != null ){
           if(temp.data == key){ // key found
               return i;
           }

           temp = temp.next;
           i++;
        }

        // key not found
        return -1;
    }

    // sear in recursive method
    public int helper(node head, int key){

        // base case
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key); // recursion

        if(index == -1){
           return -1;
        }       
        return index+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
// code for reverse an ll
    public void reverse(){
        node prev = null;
        node curr = tail = head;
        node next;

        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }
// delteing from last to nth node
    public void deleteNthFromEnd(int n){
        // 1st cal size
        int siZe = 0;
        node temp = head;

        while(temp != null){
            temp = temp.next;
            siZe++;
        }

        if(n == siZe){
            head = head.next; //firstRemove method
            return;
        }

        int i = 1;// because 0th term is head
        int index = siZe-n;
        node prev = head;
        while(i < index){
            prev = prev.next;
            i++;
        } 

        // now just point prev pointer to next of nth node
        prev.next = prev.next.next;
        return;        
    }  
// slow-fast approch
    public node findMid(node head){
        node slow = head;   
        node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2     
        }         
        return slow; //slow is my middle
    }  
// now perform another steps
    public boolean checkPlaindrome(){
        if(head == null || head.next == null){// if 0 & 1 node
            return true;
        } 
        // 1st intitalize mid value
        node mid = findMid(head);

        // 2nd reverse the half part
        node prev = null;
        node curr = mid;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node left = head;
        node right = prev; //right half head
        // 3rd check both parts        
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }        
        return true;
    }       
// detecting the loop/ cycle in ll
    public static boolean isCycle(){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; // cycle exist
            }
        }              
        return false;// doesn't exist
    }   
// remove cycle from node 
    public static void removeCycle(){
        // check if cycle exist
        node slow = head;
        node fast = head;
        boolean cyc = false;
        while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
               cyc = true;
               break;
           }
        } 
        if(cyc == false){
            return;
        }
        // found the node 
        slow = head;
        node prev = null; // last node
        while( slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // point last node = last.next = null
        prev.next = null;
        return;
    }    
// Merge sort
     private node getMid(node head){
         node slow = head;
         node fast = head.next;
         while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next;
         }
         return slow;
     }
     
     private node merge(node left, node right){

        node mergedll = new node(-1);
        node temp = mergedll;

        while(left != null && right != null){
          if(left.data <= right.data){
             temp.next = left;
             left = left.next;
             temp = temp.next;
          }else{
            temp.next = right;
            right = right.next;
            temp = temp.next;
          }
        }

        while(left != null){
            temp.next = left;
             left = left.next;
             temp = temp.next;
        }

        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedll.next;
     }
     public node mergeSort(node head){
         // base case
         if(head == null || head.next == null){
             return head;
         }
         // find mid vale (last of left part)
         node middleVal = getMid(head);
         // check for lefthead or righthead
         node righthead = middleVal.next;
         middleVal.next = null;
         node newLeft = mergeSort(head);
         node newRight = mergeSort(righthead);
         //return mergeSort
         return merge(newLeft,newRight);
     }

     public void zigZag(){
         // find mid
         node slow = head;
         node fast = head.next;
        while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
        }
        node mid = slow;
        // divide into two parts or reverse the right part
        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node left = head;
        node right = prev;
        node nextl,nextr;

        // alternate merge 
        while(left != null && right != null){
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;
            right = nextr;
        }
     }
    public static void main(String[] args) {
        LinkedLists ll =new LinkedLists();        
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printNode();
        ll.zigZag();
        ll.printNode();
        
    }
    
}
