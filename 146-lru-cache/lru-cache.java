class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}
class LRUCache {
    HashMap<Integer,Node> hm=new HashMap<>();
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node temp=hm.get(key);
            remove(temp);
            InsertatFirst(temp);
            return temp.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node temp=hm.get(key);
            temp.val=value;
            remove(temp);
            InsertatFirst(temp);
        }
        else{
            if(hm.size()==capacity){
                Node temp=tail.prev;
                hm.remove(temp.key);
                remove(temp);
            }
            Node temp=new Node(key,value);
            InsertatFirst(temp);
            hm.put(key,temp);
        }
         
    }
    public void InsertatFirst(Node temp){
        Node next=head.next;
        temp.next=next;
        head.next=temp;
        next.prev=temp;
        temp.prev=head;
    }
    public void remove(Node temp){
        Node prev=temp.prev;
        Node next=temp.next;
        prev.next=next;
        next.prev=prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */