class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        boolean fresh=false;
        boolean rotten =false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    rotten =true;
                }
                if(grid[i][j]==1){
                    fresh=true;
                }
            }
        }
        if(!fresh) return 0;
        if(!rotten) return -1;
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                //down
                if(r+1 <m && grid[r+1][c]==1){
                    q.add(new int[]{r+1,c});
                    grid[r+1][c]=2;
                }
                //up
                if(r-1>=0 && grid[r-1][c]==1){
                    q.add(new int[]{r-1,c});
                    grid[r-1][c]=2;
                }
                //left
                if(c-1 >=0 && grid[r][c-1]==1){
                    q.add(new int[]{r,c-1});
                    grid[r][c-1]=2;
                }
                //right
                if(c+1 <n && grid[r][c+1]==1){
                    q.add(new int[]{r,c+1});
                    grid[r][c+1]=2;
                }
                size--;
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