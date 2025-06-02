/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Node curr=head;
        Node tail=head;
        
        while(tail.next != null){
            tail = tail.next;
        }
        
        while(tail.data>curr.data){
            int sum=curr.data+tail.data;
            if(sum==target){ 
                ans.add(new ArrayList<>(
                Arrays.asList(curr.data,tail.data)));
                curr=curr.next;
                tail=tail.prev;
            }
            else if(sum<target) curr=curr.next;
            else tail=tail.prev;
        }
        return ans;
    }
}
