class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=grid[i][0];
            dp[i][0]=sum;
        }
        sum=0;
        for(int i=0;i<n;i++){
            sum+=grid[0][i];
            dp[0][i]=sum;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int up=dp[i-1][j];
                int left=dp[i][j-1];
                dp[i][j]=Math.min(up,left)+grid[i][j];
            }
        }
        return dp[m-1][n-1];




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