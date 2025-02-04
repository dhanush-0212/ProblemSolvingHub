class Solution {
    public int maxAscendingSum(int[] nums) {
        int currsum=nums[0],maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currsum=nums[i]>nums[i-1]?currsum+nums[i]:nums[i];
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}