class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=1;i<m;i++){
            grid[i][0]+=grid[i-1][0];
        }
        
        for(int i=1;i<n;i++){
            grid[0][i]+=grid[0][i-1];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int up=grid[i-1][j];
                int left=grid[i][j-1];
                grid[i][j]=Math.min(up,left)+grid[i][j];
            }
        }
        return grid[m-1][n-1];




        //return helper(grid,m-1,n-1,new int[m][n]);
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