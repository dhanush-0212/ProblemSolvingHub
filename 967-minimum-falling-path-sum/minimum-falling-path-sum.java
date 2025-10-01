class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int min=Integer.MAX_VALUE;
        int[][] dp=new int[n][n];
        dp[n-1]=matrix[n-1];
        for(int i=n-2;i>=0;i--){
            int left=Integer.MAX_VALUE,down=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){

                if(j>0) left=dp[i+1][j-1];
                down=dp[i+1][j];
                if(j<n-1)right=dp[i+1][j+1];

                int curr=matrix[i][j];
                dp[i][j]=curr + Math.min(down,Math.min(left,right));
            }
        }
        for(int j=0;j<n;j++){
            min=Math.min(min,dp[0][j]);
        }
        return min;
    }

    public int helper(int[][] arr,int i,int j,int[][] dp){
        
        if(i<0 || j<0 || j>=arr.length || i>=arr.length) return Integer.MAX_VALUE;
        if(i==0) return arr[i][j];
        if(dp[i][j]!=0) return dp[i][j];

        int left=helper(arr,i-1,j-1,dp);
        int top=helper(arr,i-1,j,dp);
        int right=helper(arr,i-1,j+1,dp);

        return dp[i][j]=arr[i][j]+Math.min(top,Math.min(left,right));

    }
}