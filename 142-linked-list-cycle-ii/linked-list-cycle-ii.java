/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

       while(fast !=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next; //moving both to find collision point
        if(slow==fast){
            slow=head;      // starting from head to find starting
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next; //moving one step to find starting point
            }
            return slow;
        }
       }
       return null;
    }
}