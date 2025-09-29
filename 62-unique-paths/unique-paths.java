class Solution {
    public int uniquePaths(int m, int n) {
       // int[][] dp=new int[m][n];

        // for(int i=0;i<m;i++){
        //     dp[i][0]=1;
        // }
        // for(int i=0;i<n;i++){
        //     dp[0][i]=1;
        // }
        int[] prev=new int[n];
        for(int i=0;i<n;i++) prev[i]=1;
        for(int i=1;i<m;i++){
            int[] temp=new int[n];
            temp[0]=1;
            for(int j=1;j<n;j++){     
               temp[j]=prev[j]+temp[j-1];
            }
            prev=temp;
        }
        return prev[n-1];

        //return helper(m-1,n-1,new int[m][n]);
    }
    // public int helper(int i,int j,int[][] dp){
    //     if(i==0 && j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=0) return dp[i][j];
    //     int up=helper(i-1,j,dp);
    //     int left=helper(i,j-1,dp);
    //     return dp[i][j]=up+left;
    // }

}