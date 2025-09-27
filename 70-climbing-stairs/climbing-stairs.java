class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        int ans=helper(n,dp);
        return ans;
    }
    public int helper(int n,int[] dp){
        if(n==1 || n==2 || n==3) return n;
        if(dp[n] !=0) return dp[n];

        return dp[n]=helper(n-1,dp)+helper(n-2,dp);
    }
}