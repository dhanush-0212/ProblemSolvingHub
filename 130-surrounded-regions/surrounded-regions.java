class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] dirs={{-1,0},{0,+1},{+1,0},{0,-1}};


        for(int i=0;i<m;i++){
            if(board[i][0] == 'O') helper(i,0,board,dirs);
            if(board[i][n-1] == 'O') helper(i,n-1,board,dirs);
        }

        for(int j=0;j<n;j++){
            if(board[0][j] == 'O') helper(0,j,board,dirs);
            if(board[m-1][j]=='O') helper(m-1,j,board,dirs);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void helper(int row,int col,char[][] board,int[][] dirs){
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!='O'){
            return;
        }
        board[row][col]='#';

        for(int[] dir:dirs){

            int nr=row+dir[0];
            int nc=col+dir[1];

            helper(nr,nc,board,dirs);
        }
    }
}