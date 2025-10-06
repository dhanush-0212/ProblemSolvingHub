// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int totsum=0;
        for(int num:arr) totsum+=num;

        int k=totsum;
        int n=arr.length;
        boolean[][] dp=new boolean[n][k+1];
        
        for(int i=0;i<n;i++) dp[i][0]=true;
        if (arr[0] <= k)dp[0][arr[0]]=true;
        
        for(int i=1;i<n;i++){
            for(int target=1;target<=k;target++){
                
                boolean notpick=dp[i-1][target];
                boolean pick=false;
                if(arr[i]<=target)
                    pick=dp[i-1][target-arr[i]];
            
                dp[i][target] = pick || notpick;
            }
        }   

        //dp[n-1][0......totsum/2];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=totsum/2;i++){
            if(dp[n-1][i]){
                int s1=i;
                int s2=totsum-s1;
                int diff=Math.abs(s2-s1);
                min=Math.min(min,diff);
            }
        }
        return min;     
    }
}
