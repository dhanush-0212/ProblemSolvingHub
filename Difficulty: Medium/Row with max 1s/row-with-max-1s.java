// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int max_ones=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            int cnt_ones=m-lowerbound(arr[i],1);
            if(cnt_ones > max_ones){
                max_ones=cnt_ones;
                index=i;
            }
        }
        return index;
    }
    public int lowerbound(int[] arr,int x){
        int high=arr.length-1,low=0;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}