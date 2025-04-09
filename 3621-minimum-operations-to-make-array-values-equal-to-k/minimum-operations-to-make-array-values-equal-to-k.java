class Solution {
    public int minOperations(int[] nums, int k) {
        int mini = Integer.MAX_VALUE;
        for (int num : nums) mini = Math.min(mini, num);
        if (mini < k) return -1;
        HashSet<Integer> hs=new HashSet<>();
        int op=0;
        for(int num:nums){
            hs.add(num);
        }
        return hs.size()-(mini==k?1:0);
    }
}