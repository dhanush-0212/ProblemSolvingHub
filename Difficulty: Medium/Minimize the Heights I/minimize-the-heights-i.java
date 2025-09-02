// User function Template for Java
class Solution {
    public int getMinDiff(int[] a, int k) {
        int n = a.length;
        if(n==0 || n==1) return 0;
        
        Arrays.sort(a);
        int ans = a[n-1] - a[0];
        int smallest = a[0] + k;
        int largest = a[n-1] - k;
        
        for(int i=0; i<n-1; i++) {
            int min = Math.min(smallest, a[i+1] - k);
            int max = Math.max(largest, a[i] + k);
            
            // Allow negative values
            ans = Math.min(ans, max - min);
        }
        
        return ans;
    }
}