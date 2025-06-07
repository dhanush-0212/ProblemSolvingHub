class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        if(nums.length==0) return 0;
        //if(nums.length==1) return nums[0]==target?1:0;
        int[][] dp=new int[nums.length][target+1];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return helper(nums,nums.length-1,target,dp);
        
    }
    public int helper(int[] nums,int idx,int sum,int[][] dp){
        
       // if(sum==0) return 1;
        if(idx==0){
            if(sum==0 && nums[0]==0) return 2;
            if(sum==0||nums[0]==sum) return 1;
            return 0;
        }
        if(dp[idx][sum] !=-1) return dp[idx][sum];
        int notpick=helper(nums,idx-1,sum,dp);
        int pick=0;
        if(sum>=nums[idx]) pick=helper(nums,idx-1,sum-nums[idx],dp);
        
        return dp[idx][sum]=notpick+pick;
    }
}