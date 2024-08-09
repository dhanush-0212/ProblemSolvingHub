class Solution {
    public int numIslands(char[][] grid) {
        int[][] temp=new int[grid.length][grid[0].length];
        int i,j;
        int ans=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                temp[i][j]=grid[i][j]-'0';
            }
        }
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
               if(temp[i][j]==1){
                islands(temp,i,j);
                ans++;
               }
            }
        }
        return ans;
    }
    public static void islands(int[][] temp,int r,int c){
        temp[r][c]=0;
        if(c-1>=0  && temp[r][c-1]==1){
            islands(temp,r,c-1);
        }
        if(c+1<temp[0].length && temp[r][c+1]==1){
            islands(temp,r,c+1);
        }
        if(r+1< temp.length && temp[r+1][c]==1){
            islands(temp,r+1,c);
        }
        if(r-1>=0 && temp[r-1][c]==1){
            islands(temp,r-1,c);
        }
    }
}
