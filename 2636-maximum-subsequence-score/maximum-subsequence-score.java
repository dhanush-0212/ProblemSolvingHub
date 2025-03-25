class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] pairs=new int[n][2];

        for(int i=0;i<n;i++){
            pairs[i]=new int[]{nums2[i],nums1[i]};
        }
        Arrays.sort(pairs,(a,b)->b[0]-a[0]);

        long sum=0,ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            int num1=pairs[i][0];
            int num2=pairs[i][1];

            sum+=num2;
            pq.add(num2);

            if(pq.size()>k){
                sum-=pq.remove();
            }
            if(pq.size()==k){
                ans=Math.max(ans,sum*num1);
            }
        }
        return ans;
    }
}