class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];

        //return helper(m-1,n-1,new int[m][n]);
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