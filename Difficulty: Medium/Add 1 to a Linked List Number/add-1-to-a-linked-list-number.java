/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head == null) return head;
      //  Node newhead;
        int carry=helper(head);
        if(carry==1){
            Node newhead=new Node(1);
            newhead.next=head;
            return newhead;
        }
        return head;
    }
    public int helper(Node head){
        if(head==null) return 1;
        
        int carry=helper(head.next);
        
        head.data=head.data+carry;
        if(head.data<10) return 0;
        head.data=0;
        return 1;
    }
}