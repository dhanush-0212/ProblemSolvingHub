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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0,null);
        ListNode head=ans;
        int sum=0,nextnum=0;
        while(l1 !=null || l2 !=null || nextnum !=0){

            int num1=(l1 !=null)?l1.val:0;
            int num2=(l2!=null)?l2.val:0;

            sum=nextnum+num1+num2;
            int curr=sum%10;
            nextnum=sum/10;

            ListNode temp=new ListNode(curr);
            ans.next=temp;
            ans=ans.next;

            l1= l1 !=null ? l1.next:null;
            l2= l2 !=null ? l2.next:null ;
        }

        return head.next;
    }
}