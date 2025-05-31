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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast !=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next; 
        }

        ListNode first=head;
        ListNode second= reverselist(slow);

        while(second !=null){
            if(first.val != second.val) return false;
            first=first.next;
            second=second.next; 
        }
        return true;
    }
    public ListNode reverselist(ListNode slow){
        ListNode prev=null;
        while(slow != null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        return prev;
    }
}