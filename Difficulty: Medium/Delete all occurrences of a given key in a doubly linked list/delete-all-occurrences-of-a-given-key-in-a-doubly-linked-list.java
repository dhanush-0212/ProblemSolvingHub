// User function Template for Java

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
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        Node dum=new Node();
        dum.data=0;
        Node curr=dum;
        while(temp != null){
            if(temp.data != x){
                curr.next=temp;
                temp.prev=curr;
                curr=curr.next;
            }
            temp=temp.next;
        }
        curr.next=null;
        return dum.next;
    }
}