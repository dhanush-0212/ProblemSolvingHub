class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long num:nums){
            pq.add(num);
        }
        while (pq.size() > 1 && pq.peek()<k){
            long num1=pq.poll();
            long num2=pq.poll();
            long sum=(num1 * 2) +num2;
            pq.add(sum);
            ans++;
        }
        return ans;
    }
}