class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rows=new HashSet<>();
        Set<String> cols=new HashSet<>();
        Set<String> boxes=new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char c=board[i][j];
                if(c !='.'){
                    if(!rows.add(c+"-"+i)) return false;
                    if(!cols.add(c+"-"+j)) return false;
                    if(!boxes.add(c+"-"+i/3+"-"+j/3)) return false;
                }
            }
        }
        return true;
    }
}