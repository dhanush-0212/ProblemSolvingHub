class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int[][] dirs={{-1,0},{0,+1},{+1,0},{0,-1}};
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,vis,grid,dirs);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,boolean[][] vis,char[][] grid,int[][] dirs){

        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || vis[row][col] || grid[row][col]=='0'){
            return;
        }

        grid[row][col]='0';
        vis[row][col]=true;
        for(int[] dir:dirs){

            int newrow=row+dir[0];
            int newcol=col+dir[1];
            dfs(newrow,newcol,vis,grid,dirs);
        }
    }
}