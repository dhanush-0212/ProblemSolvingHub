class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int left=0,right=matrix[0].length-1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        while(left<right){
            for(int i=0;i<n;i++){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
            }
            left++;
            right--;
        }
    }
}