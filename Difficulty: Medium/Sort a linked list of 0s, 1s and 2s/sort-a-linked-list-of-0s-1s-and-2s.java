/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        if(head==null) return head;
        // code here
        Node zeros=new Node(-1);
        Node zeroshead=zeros;
        Node ones=new Node(-1);
        Node oneshead=ones;
        Node twos=new Node(-1);
        Node twoshead=twos;
        
        Node curr=head;
        while(curr!=null){
            if(curr.data == 0){
                zeros.next=curr;
                zeros=zeros.next;
            }
            else if(curr.data == 1){
                ones.next=curr;
                ones=ones.next;
            }
            else{
                twos.next=curr;
                twos=twos.next;;
            }
            curr=curr.next;
        }
        zeros.next=oneshead.next!= null ?oneshead.next:twoshead.next;
        ones.next=twoshead.next;
        twos.next=null;
        return zeroshead.next;
    }
}