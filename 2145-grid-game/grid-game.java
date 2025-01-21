class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        if(n<2) return 0;
        long topsum=0;
        for(int val: grid[0]) topsum+=val;

        long min=Long.MAX_VALUE;
        long bottom=0;

        for(int pp=0;pp<n;pp++){
            topsum-=grid[0][pp];
            min=Math.min(min,Math.max(topsum,bottom));
            bottom+=grid[1][pp];
        }
        return min;
    }
}