// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        
        int l=0,tot=0,len=Integer.MAX_VALUE;
        for(int r=0;r<arr.length;r++){
        tot+=arr[r];
            while(tot>x){
                 len=Math.min(len,r-l+1);
                tot-=arr[l];
                l++;
               
               // len=
            }
            
           
            
            
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}
