class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char[][] board){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.'){
                    for(char c='1';c<='9';c++){
                        if(isvalid(i,j,c,board)){
                            board[i][j]=c;
                            if(helper(board)) return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    } 
    public boolean isvalid(int row,int col,char c,char[][] board){
        for(int i=0;i<9;i++){
            if(board[i][col]==c || board[row][i]==c) return false;
        }
       int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == c) return false;
            }
        }
        return true;

    }
}