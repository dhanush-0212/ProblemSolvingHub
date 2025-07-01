class Solution {
    public int trap(int[] arr) {
        int leftmax=0,rightmax=0,l=0,r=arr.length-1;
        int total=0;
        while(l<r){

            if(arr[l]<arr[r]){
                if(arr[l]<leftmax) total+=leftmax-arr[l];
                else leftmax=arr[l];
                l++;
            }
            else {
                if(arr[r]< rightmax) total+=rightmax-arr[r];
                else rightmax=arr[r];
                r--;
            }
        }
        return total;
    }
}