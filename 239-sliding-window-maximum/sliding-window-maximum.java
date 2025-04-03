import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){

            if(!dq.isEmpty() && dq.peek()==i-k) dq.remove();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.removeLast();

            dq.add(i);

            if(i>=k-1) list.add(nums[dq.peek()]);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}