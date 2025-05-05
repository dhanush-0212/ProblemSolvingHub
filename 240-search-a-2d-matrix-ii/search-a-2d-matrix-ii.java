class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
         if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int row=0;
        int col=n-1;
        while(row<m && col>=0){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;
    }
}