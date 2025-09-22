/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int num:arr){
            int temp=num,rev=0;
            while(temp!=0){
                int last=temp%10;
                rev=(rev*10)+last;
                temp/=10;
            }
            if(num !=rev) return false;
        }
        return true;
    }
}