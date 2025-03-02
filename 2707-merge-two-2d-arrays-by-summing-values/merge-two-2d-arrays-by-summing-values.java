class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0,j=0;
        ArrayList<int[]> res=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            int id1=nums1[i][0];
            int id2=nums2[j][0];
            if(id1==id2){
                res.add(new int[]{id1,(nums1[i][1]+nums2[j][1])});
                i++;
                j++;
            }
            else if(id1<id2){
                res.add(nums1[i]);
                i++;
            }
            else{
                res.add(nums2[j]);
                j++;
            }
        }
        while (i < nums1.length) {
            res.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            res.add(nums2[j]);
            j++;
        }
        int[][] ans=new int[res.size()][2];
        for(i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;

    }
}