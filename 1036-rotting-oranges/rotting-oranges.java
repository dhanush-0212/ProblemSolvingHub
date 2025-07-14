class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dir={{-1,0},{0,+1},{+1,0},{0,-1}};
       // boolean[][] vis=new boolean[m][n];
       boolean fresh=false;
        boolean rotten=false;
        Queue<int[]> q=new ArrayDeque<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    rotten=true;
                }
                if(grid[i][j]==1){
                    fresh=true;
                }
            }
        }
        if( !fresh ) return 0;
        if(!rotten) return -1;
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                int[] temp=q.poll();
                int row=temp[0];
                int col=temp[1]; 

                if(row-1 >=0 && grid[row-1][col] == 1){
                    q.add(new int[]{row-1,col});
                    grid[row-1][col]=2;
                }
                if(row+1 <m && grid[row+1][col] == 1){
                    q.add(new int[]{row+1,col});
                    grid[row+1][col]=2;
                }
                if(col-1 >=0 && grid[row][col-1] == 1){
                    q.add(new int[]{row,col-1});
                    grid[row][col-1]=2;
                }
                if(col+1 <n && grid[row][col+1] == 1){
                    q.add(new int[]{row,col+1});
                    grid[row][col+1]=2;
                }
            }
            time++;
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                   return -1;
                }
            }
        }
    return time-1;
    }
}