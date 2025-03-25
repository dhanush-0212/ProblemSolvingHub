class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        
        // Step 1: Create pairs (nums2[i], nums1[i]) and sort by nums2[i] descending
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[]{nums2[i], nums1[i]};
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]); // Sort by nums2 descending

        // Step 2: Use a Min Heap (Priority Queue) to track top k elements from nums1
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0, maxScore = 0;

        // Step 3: Iterate over sorted pairs
        for (int i = 0; i < n; i++) {
            int num2 = pairs[i][0]; // nums2[i] (guaranteed decreasing order)
            int num1 = pairs[i][1]; // nums1[i]

            sum += num1;
            pq.add(num1);

            // If size exceeds k, remove the smallest element from nums1 to maintain k elements
            if (pq.size() > k) {
                sum -= pq.poll();
            }

            // Once we have exactly k elements, calculate max score
            if (pq.size() == k) {
                maxScore = Math.max(maxScore, sum * num2);
            }
        }

        return maxScore;
    }
}