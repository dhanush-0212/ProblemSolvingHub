/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        if(head==null) return new Node(x);
        
        // Your code here
        Node curr=head;
        int i=0;
        while(i<p){
            curr=curr.next;
            i++;
        }
        Node temp=curr.next;
        Node newnode=new Node(x);
        newnode.next=temp;
        newnode.prev=curr;
        curr.next=newnode; return head;
    }
   
}