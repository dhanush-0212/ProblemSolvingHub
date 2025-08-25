class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        List<Integer> ls=new ArrayList<>();
        int[] ans=new int[m*n];
        int idx=0;
        for(int i=0;i<m+n-1;i++){
            List<Integer> temp=new ArrayList<>();
            int r=(i<n)?0:i-n+1;
            int c=(i<n)?i:n-1;

            while(r<m && c>=0){
                temp.add(mat[r][c]);
                r++;
                c--;
            }
            if(i%2 ==0){
                Collections.reverse(temp);
            }
            for(int val:temp){
                ans[idx++]=val;
            }
        }
        return ans;
    }
}