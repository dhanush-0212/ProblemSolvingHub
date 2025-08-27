// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
        
        for(int num:arr){
            pq.add(num);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}
