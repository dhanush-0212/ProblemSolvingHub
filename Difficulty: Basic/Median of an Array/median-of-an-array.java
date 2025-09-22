class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int half=arr.length/2;
        return (double)arr.length%2==0?((arr[half]+arr[half-1])/2.0):arr[half]; 
    }
}
