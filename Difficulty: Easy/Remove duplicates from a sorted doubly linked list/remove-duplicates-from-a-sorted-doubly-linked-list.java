// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head==null) return head;
        Node temp=head;
        while(temp !=null && temp.next !=null){
            Node next=temp.next;
            while(next !=null && next.data==temp.data){
                next=next.next;
            }
            temp.next=next;
            if(next != null) next.prev=temp;
            temp=temp.next;
            
        }
        return head;
    }
}