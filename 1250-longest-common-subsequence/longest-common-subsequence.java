class Solution {      
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
             Arrays.fill(dp[i], -1);
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        for(int idx1=1;idx1<=n;idx1++){
            for(int idx2=1;idx2<=m;idx2++){

                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    dp[idx1][idx2]=1+dp[idx1-1][idx2-1];
                } 
                else{
                    dp[idx1][idx2]=Math.max(dp[idx1-1][idx2],dp[idx1][idx2-1]);
                }
            }
        }

        return dp[n][m];
    }
    public int helper(int idx1,int idx2,String s1,String s2,int dp[][]){
        if(idx1<0 || idx2<0){
            return 0;
        }
        if(dp[idx1][idx2]!=-1){return dp[idx1][idx2];}
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2]=1+helper(idx1-1,idx2-1,s1,s2,dp);
        }
        return dp[idx1][idx2]=Math.max(helper(idx1-1,idx2,s1,s2,dp),helper(idx1,idx2-1,s1,s2,dp));
    }
}