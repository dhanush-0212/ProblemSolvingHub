class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int down=matrix.length-1;
        List<Integer> list=new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return list;
        }
        while (left <= right && top <= down) {

            //left to right(top)
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            //top to down(right)
            for(int i=top;i<=down;i++){
                list.add(matrix[i][right]);
            }
            right--;

            //right to left(down)
            if(top<=down){
            for(int i=right;i>=left;i--){
                list.add(matrix[down][i]);
            }
            down--;
            }

            //down to top(left)
            if(left<=right){
            for(int i=down;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;
    }
}