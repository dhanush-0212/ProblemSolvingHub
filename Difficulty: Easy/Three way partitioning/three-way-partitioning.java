class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]<a){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]>b){
                swap(arr,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }
       
    
     public void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}