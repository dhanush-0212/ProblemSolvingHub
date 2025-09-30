class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return helper(grid,m-1,n-1,new int[m][n]);
    }
    public int helper(int[][] grid,int i,int j,int[][] dp){

        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j] !=0) return dp[i][j];
        int up=helper(grid,i-1,j,dp);
        int left=helper(grid,i,j-1,dp);

        return dp[i][j]=Math.min(up,left)+grid[i][j];
    }
}