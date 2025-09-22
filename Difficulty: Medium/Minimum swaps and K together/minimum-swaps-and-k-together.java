// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int gcnt=0;
        for(int val:arr){
            if(val<=k) gcnt++;
        }
        int minswaps=gcnt;
        int bcnt=0;
        for(int i=0;i<gcnt;i++){
            if(arr[i]>k) bcnt++;
        }
        minswaps=Math.min(minswaps,bcnt);
        for(int i=gcnt;i<arr.length;i++){
            if(arr[i]>k) bcnt++;
            if(arr[i-gcnt]<=k) bcnt--;
            minswaps=Math.min(minswaps,bcnt);
        }
        return minswaps;
    }
}
