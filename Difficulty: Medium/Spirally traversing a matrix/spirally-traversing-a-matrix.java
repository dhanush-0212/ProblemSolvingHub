class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int top=0,bottom=n-1;
        int left=0,right=m-1;
        
        
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=right && top<=bottom){
            
            //left to right
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            
            //top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;
            
            //right to left
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(mat[bottom][i]);
            }
            bottom--;
            }
            
            //bottom to top
            if(left<=right){
            for(int  i=bottom;i>=top;i--){
                list.add(mat[i][left]);
            }
            left++;
            }
        }
        return list;
    }
}
