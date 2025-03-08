class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int left=0,ans=Integer.MAX_VALUE,w=0;
        for(int right=0;right<n;right++){
            if(blocks.charAt(right)=='W'){
                w++;
            }
            if(right-left+1==k){
                ans=Math.min(ans,w);
                if(blocks.charAt(left)=='W'){
                    w--;
                }
                left++;
            }
        }
        return ans;
    }
}