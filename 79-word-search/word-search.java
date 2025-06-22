class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length==0 ) return false; 
        int[][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
        boolean[][] visited=new boolean[board.length][board[0].length];
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)== board[i][j]){
                    if(helper(board,word,i,j,0,dirs,visited)) return true;
                }
            }

        }
            return false;
    }
    public boolean helper(char[][] board, String word,int row,int col,int idx,int[][] dirs,boolean[][] visited){
        
        if(idx ==  word.length()) return true;
        if(row < 0 || row >= board.length || col < 0 || col>=board[0].length 
                   || board[row][col] != word.charAt(idx) || visited[row][col]){
                    return false;
                   }
        
        visited[row][col]=true;
        
        for(int[] dir:dirs){
           int newrow=row + dir[0];
            int newcol=col+dir[1];
            if (helper(board, word, newrow, newcol, idx + 1, dirs, visited)) {
                return true;
            }
        }
        visited[row][col]=false;
        return false;
    }
    
}