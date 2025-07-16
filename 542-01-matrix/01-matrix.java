class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]> q=new ArrayDeque<>();
        //int[][] ans=new int[m][n];
        // for(int[] row:ans){
        //     Arrays.fill(row,-1);
        // }
        int[][] dirs={{-1,0},{0,+1},{+1,0},{0,-1}};
        //boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                   q.add(new int[]{i,j});
                }
                else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        while(!q.isEmpty()){
            int[] temp=q.poll();
            int row=temp[0];
            int col=temp[1];
            //int third=temp.third;

            for(int[] dir:dirs){
                int nr=row+dir[0];
                int nc=col+dir[1];

                if(nr>=0 && nr<m && nc>=0 && nc<n && mat[nr][nc]> mat[row][col]+1){
                    mat[nr][nc]=mat[row][col]+1;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return mat;
    }
}
// class pair{
//     int first;
//     int second;
//     int third;
//     pair(int first,int second,int third){
//         this.first=first;
//         this.second=second;
//         this.third=third;
//     }
// }