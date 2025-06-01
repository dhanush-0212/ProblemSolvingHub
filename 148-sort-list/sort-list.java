/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode middle=findmiddle(head);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode curr=new ListNode(0,null);
        ListNode head=curr;
        while(list1 !=null && list2 !=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next; 
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        curr.next=list1 != null?list1:list2;
        return head.next;
    }
}