class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dirs={{-1,0},{0,+1},{+1,0},{0,-1}};
        for(int i=0;i<m;i++){
            if(grid[i][0]==1) helper(i,0,grid,dirs);
            if(grid[i][n-1] ==1) helper(i,n-1,grid,dirs);
        }
        for(int j=0;j<n;j++){
            if(grid[0][j]==1) helper(0,j,grid,dirs);
            if(grid[m-1][j] ==1) helper(m-1,j,grid,dirs);
        }
        int cnt=0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(grid[i][j]==1) cnt++;
            }
        }
        return cnt;
    }
    public void helper(int row,int col,int[][] grid,int[][] dirs){

        if(row<0 || row >=grid.length || col<0 || col>=grid[0].length || grid[row][col] !=1){
            return;
        }

        grid[row][col]=-1;

        for(int[] dir: dirs){
            int nr=row+dir[0];
            int nc=col+dir[1];

            helper(nr,nc,grid,dirs);
        }
    }
}