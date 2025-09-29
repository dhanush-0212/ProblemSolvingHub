class Solution {
    public int uniquePaths(int m, int n) {
        return helper(m-1,n-1,new int[m][n]);
    }
    public int helper(int i,int j,int[][] dp){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int up=helper(i-1,j,dp);
        int left=helper(i,j-1,dp);
        return dp[i][j]=up+left;
    }
}