class Solution {
    public int median(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][m-1]);
        }
        
        int req=(n*m)/2;
        
        while(low<=high){
            int mid=(low+high)/2;
            int smallequal=countSmallerEqual(mat,n,m,mid);
            if(smallequal<=req)     low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public int countSmallerEqual(int[][] mat,int n,int m,int x){
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=ub(mat[i],x,m);
        }
        return cnt;
    }
    public int ub(int[] mat,int x,int n){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}