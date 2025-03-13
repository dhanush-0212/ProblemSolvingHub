class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int index=0;
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        while(index<n){
            int currstart=intervals[index][0];
            int currend=intervals[index][1];

            while(index<n-1 && currend>=intervals[index+1][0]){
                currend=Math.max(currend,intervals[index+1][1]);
                index+=1;
            }
            int[] ans={currstart,currend};
            res.add(ans);
            index+=1;
        }
        return res.toArray(new int[res.size()][]);
    }
}