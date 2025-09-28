class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        //if(nums.length==2) return Math.max(nums[0],nums[1]);
        // int[] dp=new int[nums.length+1];
        // dp[0]=nums[0];
        int prev=nums[0],prev2=0;
        for(int i=1;i<nums.length;i++){

            int pick=nums[i];
            if(i>1) pick+=prev2;
            int nonpick=0+prev;
            int curr=Math.max(pick,nonpick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}