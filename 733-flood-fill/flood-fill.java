class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int m=image.length;
        int n=image[0].length;
        int srcclr=image[sr][sc];
        int[][] dir={{-1,0},{0,+1},{+1,0},{0,-1}};
        int[][] ans=image;
        dfs(sr,sc,srcclr,color,ans, dir);
        return ans;
    }

    void dfs(int row,int col,int scrclr,int color,int[][] ans,int[][] directions){

        if(row<0 || row>=ans.length || col<0 || col>=ans[0].length || ans[row][col] != scrclr || ans[row][col]==color){
            return;
        }
        ans[row][col]=color;

        for(int[] dir:directions){

            int newrow=row+dir[0];
            int newcol=col+dir[1];

            dfs(newrow,newcol,scrclr,color,ans,directions);
        }
    }
}