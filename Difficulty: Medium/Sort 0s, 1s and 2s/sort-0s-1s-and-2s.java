class Solution {
    public void sort012(int[] arr) {
        // code here
        //Dutch bational flag algorithm
        int zero=0,i=0,two=arr.length-1;
       while(i<=two){
            if(arr[i]==0){
                swap(arr,zero,i);
                zero++;
                i++;
            }
            else if(arr[i]==1) i++;
            else if(arr[i]==2){
                swap(arr,i,two);
                two--;
            }
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}