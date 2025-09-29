
class Solution {
    public int maximumPoints(int arr[][]) {
    
        // Bottom-up approach ,,,,memoized
        return helper(arr,arr.length-1,3,new int[arr.length+1][4]);
    }
    
    public int helper(int[][] arr,int day,int lastTask,int dp[][]){
        if(day==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i !=lastTask){
                    max=Math.max(max,arr[0][i]);
                }
            }
            return max;
        }
        if(dp[day][lastTask] !=0) return dp[day][lastTask];
        int max=0;
        for(int task=0;task<3;task++){
            if(task !=lastTask){
                int point=arr[day][task]+helper(arr,day-1,task,dp);
               max=Math.max(max,point);
            }
        }
        return dp[day][lastTask]=max;
    }
}