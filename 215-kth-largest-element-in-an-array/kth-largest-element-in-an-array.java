class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        for(int i=0;i<k;i++){
            q.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>q.peek()){
                q.remove();
                q.offer(nums[i]);
            }
        }
        return q.peek();
    }
}