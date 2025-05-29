/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node curr=head;
        int i=0;
        while(curr != null){
            i++;
            if(i==x) break;
            curr=curr.next;
        }
        Node prev=curr.prev;
        Node next=curr.next;
        if(prev == null && next== null){
            return null;
        }
        else if(next==null){
            Node prevnode=curr.prev;
            prevnode.next=null;
            curr.prev=null;
            return head;
        }
        else if(prev== null){
            Node nextnode=curr.next;
            curr.next=null;
            nextnode.prev=null;
            return nextnode;
        }
        
        prev.next=next;
        next.prev=prev;
        curr.next=null;
        curr.prev=null;
        return head;
    }
}