// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int last = arr[n - 1];

        // Shift all elements right by 1 using System.arraycopy
        System.arraycopy(arr, 0, arr, 1, n - 1);

        // Put last element at the start
        arr[0] = last;
    }
}