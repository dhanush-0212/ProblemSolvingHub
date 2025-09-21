class Solution {
    public int trap(int[] arr) {
        // int n=height.length;
        // int prefix[]=new int[n];
        // prefix[0]=height[0];
        // for(int i=1;i<n;i++) prefix[i]=Math.max(height[i],prefix[i-1]);

        // int suffix[] =new int[n];        
        // suffix[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--) suffix[i]=Math.max(suffix[i+1],height[i]);

        // int total=0;
        // int leftmax=0;
        // for(int i=0;i<n;i++){
        //     leftmax=Math.max(leftmax,height[i]);
        //     if(height[i]<leftmax && height[i]<suffix[i]){
        //         total+=Math.min(leftmax,suffix[i])-height[i];
        //     }
        // }
        // return total;

        int lmax=0,rmax=0,tot=0;
        int l=0,n=arr.length,r=n-1;
        while(l<r){
            if(arr[l]<arr[r]){
                if(lmax>arr[l]) tot+=lmax-arr[l];
                else lmax=arr[l];
                l++;
            }
            else{
                if(rmax>arr[r]) tot+=rmax-arr[r];
                else rmax=arr[r];
                r--;
            }
        }
        return tot;
    }
}