class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int[] row={-1,0,+1,0};
        int[] col={0,+1,0,-1};
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    dfs(i,j,vis,grid,row,col);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i,int j,boolean[][] vis,char[][] grid,int[] row,int[] col){

        
        if(i <0 || i >=grid.length || j<0 || j >=grid[0].length || vis[i][j] || grid[i][j] != '1'){
            return;
        }
        vis[i][j]=true;

        for(int k=0;k<4;k++){

            int newrow=i+row[k];
            int newcol=j+col[k];

            dfs(newrow,newcol,vis,grid,row,col);
        }
    }
}