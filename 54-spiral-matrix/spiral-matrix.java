class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        int cmin=0,cmax=m-1;
        int rmin=0,rmax=n-1;
        int count=0;

        
        while(count<n*m){
            //top
            for(int col=cmin;col<=cmax &&count < n*m;col++){
                ans.add(matrix[rmin][col]);
                //System.out.println(ans);
                count++;
            }
            rmin++;

            //right
            for(int row=rmin;row<=rmax &&count < n*m;row++){
                ans.add(matrix[row][cmax]);
                //System.out.println(ans);
                count++;
            }
            cmax--;

            //bottom
            for(int col=cmax;col>=cmin &&count < n*m;col--){
                ans.add(matrix[rmax][col]);
                //System.out.println(ans);
                count++;
            }
            rmax--;

            // left
            for(int row=rmax;row>=rmin &&count < n*m;row--){
                ans.add(matrix[row][cmin]);
                //System.out.println(ans);
                count++;
            }
            cmin++;
        }

        return ans; 
    }
}