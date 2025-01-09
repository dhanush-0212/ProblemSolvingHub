class Solution {
    public int kthFactor(int n, int k) {
        int count=0,ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){count++; ans=i;}
            if(count==k){return ans;}
        }
        return -1;
    }
}