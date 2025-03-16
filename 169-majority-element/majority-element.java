class Solution {
    public int majorityElement(int[] arr) {
        int candidate=arr[0];
        int count=1;
        for(int num:arr){
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate=num;
                count=1;
            }
        }
        
        return candidate;
    }
}