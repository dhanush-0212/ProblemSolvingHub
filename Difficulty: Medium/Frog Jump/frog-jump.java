// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp=new int[height.length+1];
        Arrays.fill(dp,-1);
        return helper(dp,height.length-1,height);
    }
    int helper(int[] dp,int n,int[] height){
        if(n==0) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        int left=helper(dp,n-1,height)+Math.abs(height[n]-height[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
            right=helper(dp,n-2,height)+Math.abs(height[n]-height[n-2]);
            
        return dp[n]=Math.min(left,right);
    }
}