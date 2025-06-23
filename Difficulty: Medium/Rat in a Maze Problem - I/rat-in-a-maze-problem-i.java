class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        ArrayList<String> ans =new ArrayList<>();
        boolean[][] visited =new boolean[n][n];
        String s="";
        helper(maze,0,0,s,ans,visited,n);
        return ans;
    }
    public void helper(int[][] maze,int row,int col,String s,ArrayList<String> ans,boolean[][] visited,int n){
        
        if(row >=n || row <0 || col <0 || col >=n){
            return;
        }
        
        if(maze[row][col] == 0 || visited[row][col]==true){
            return;
        }
        
        if(row== n-1 && col == n-1){
            ans.add(s);
            return;
        }
        
        
        visited[row][col]=true;
        //down
        helper(maze,row+1,col,s+"D",ans,visited,n);
        
        //left
        helper(maze,row,col-1,s+"L",ans,visited,n);
         
        //right
        helper(maze,row,col+1,s+"R",ans,visited,n);
        
        //up
        helper(maze,row-1,col,s+"U",ans,visited,n);
        
        visited[row][col]=false;
      
        
        
    }
}