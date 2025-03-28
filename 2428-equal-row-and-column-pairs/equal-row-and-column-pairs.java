class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        int n=grid.length;
        //int m=grid[0].length;
        Map<String,Integer> set=new HashMap<>();
        for(int i=0;i<n;i++){
            int[] ans=new int[n];
            for(int j=0;j<n;j++){
                ans[j]=grid[i][j];
            }
            set.merge(Arrays.toString(ans),1,Integer::sum);
        }
        for(int i=0;i<n;i++){
            int[] ans=new int[n];
            for(int j=0;j<n;j++){
                ans[j]=grid[j][i];
            }
            if( set.containsKey(Arrays.toString(ans)) ){
                count+=set.get(Arrays.toString(ans));
            }
        }
        return count;
    }
}