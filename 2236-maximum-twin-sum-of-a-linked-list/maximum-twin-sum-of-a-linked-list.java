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
    public int pairSum(ListNode head) {
        ListNode temp=new ListNode(0,head);
        ListNode slow=temp;
        ListNode fast=head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse
        ListNode prev=null;
        ListNode curr=slow.next;
        while(curr !=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        //sum
        int ans=Integer.MIN_VALUE;
        while(prev !=null){
            ans=Math.max(ans,head.val+prev.val);
            prev=prev.next;
            head=head.next;
        }
        return ans;
    }
}