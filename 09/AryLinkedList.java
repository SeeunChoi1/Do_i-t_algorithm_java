import java.util.Comparator;

public class AryLinkedList<E>{
    //Node
    class Node<E>{
        private E data; //data
        private int next; //pointer
        private int dnext; //pointer of free list

        //set data and next
        void set(E data, int next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] n; //main list
    private int size; //capacity
    private int max; //tail record
    private int head;
    private int crnt;
    private int deleted; //head of free list
    private static final int NULL = -1; //list full, no next list

    //construtor
    public AryLinkedList(int capacity){
        head = crnt = max = deleted = NULL;
        try{
            n = new Node[capacity];
            for(int i = 0; i<capacity; i++){
                n[i] = new Node<E>();
            }
            size = capacity;
        }
        catch(OutOfMemoryError e){ //fail creating Array
            size = 0;
        }
    }

    private int getInsertIndex(){
        if(deleted == NULL){
            if(max < size) return ++max;
            else return NULL;
        }else{
            int rec = deleted;
            deleted = n[rec].dnext;
            return rec;
        }
    }

    private void deleteIndex(int idx){
        if(deleted == NULL){
            deleted = idx;
            n[idx].dnext = NULL;
        }else{
            int rec = deleted;
            deleted = idx;
            n[rec].dnext = rec;
        }
    }

    public E search (E obj, Comparator<? super E> c){
        int ptr = head;
        while(ptr != NULL){
            if(c.compare(obj, n[ptr].data) ==0){ //search success
                crnt = ptr;
                return n[ptr].data;
            }
            ptr = n[ptr].next;
        }
        return null; //search fail
    }

    public void addFirst(E obj){
        int ptr = head;
        int rec = getInsertIndex();
        if (rec != NULL){
            head = crnt = rec;
            n[head].set(obj, ptr);
        }
    }

    public void addLast(E obj){
        if(head == NULL) addFirst(obj);
        else{
            int ptr = head;
            while(n[ptr].next != NULL) ptr = n[ptr].next;
            int rec = getInsertIndex();
            if(rec != NULL){
                n[ptr].next = crnt = rec;
                n[rec].set(obj, NULL);
            }
        }
    }

    public void removeFirst(){
        if(head != NULL){
            int ptr = n[head].next;
            deleteIndex(head);
            head = crnt = ptr;
        }
    }

    public void removeLast(){
        if(head != NULL){
            if(n[head].next == NULL) removeFirst();
        }
        else{
            int ptr = head;
            int pre = head;
            
            while(n[ptr].next != NULL){
                pre = ptr;
                ptr = n[ptr].next;
            }
            n[pre].next = NULL;
            deleteIndex(pre);
            crnt = pre; //tail node after remove
        }
    }

    public void remove(int p){
        if(head != NULL){
            if(p==head) removeFirst();
        }
        else{
            int ptr = head;
            while(n[ptr].next != p){
                ptr = n[ptr].next;
                if(ptr == NULL) return; //p is not in the list
            }
            n[ptr].next = n[p].next;
            crnt = ptr;
        }
    }

    public void removeCurrentNode(){
        remove(crnt);
    }

    public void clear(){
        while(head != NULL){
            removeFirst();
        }
        crnt = NULL;
    }

    public boolean next(){
        if(crnt == NULL||n[crnt].next == NULL) return false;
        crnt = n[crnt].next;
        return true;
    }

    public void printCurrentNode(){
        if(crnt == NULL) System.out.println("no node selected");
        else System.out.println(n[crnt].data);
    }

    public void dump(){
        int ptr = head;

        while(ptr != NULL){
            System.out.println(n[ptr].data);
            ptr = n[ptr].next;
        }
    }    

}