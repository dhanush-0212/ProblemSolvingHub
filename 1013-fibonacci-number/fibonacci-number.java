class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        return helper(n,dp);
    }
    public int helper(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int nm1=helper(n-1,dp);
        int nm2=helper(n-2,dp);
        dp[n]=nm1+nm2;
        return nm1+nm2;
    }
}