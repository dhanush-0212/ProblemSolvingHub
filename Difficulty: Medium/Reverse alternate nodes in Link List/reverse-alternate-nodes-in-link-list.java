/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution {
    public static void rearrange(Node head) {
        // add your code here
        if(head==null || head.next == null) return;
        
        // Node first=head;
        // Node second=head.next;
        
        Node odd=head;
        Node even=head.next;
        
        Node oddhead=odd;
        Node evenhead=even;
        
        while(even != null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        // odd.next=null;
        // even.next=null;
        evenhead=reverse(evenhead);
        odd.next=evenhead;
        // head=oddhead.next;
    }
    public static Node reverse(Node head){
        
        Node prev=null;
        Node curr=head;
        while(curr !=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}