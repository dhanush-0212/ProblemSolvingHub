class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int n=arr.length;
        int i=0;
        List<int[]> list=new ArrayList<>();
        while(i<n){
            int current_start=arr[i][0];
            int current_end=arr[i][1];
            int j=i+1;
            while(j<n && arr[j][0]<=current_end){
                current_end=Math.max(arr[j][1],current_end);
                j++;
            }
            list.add(new int[]{current_start,current_end});
            i=j;
        }
        int[][] ans=new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
    return ans;
    }
}