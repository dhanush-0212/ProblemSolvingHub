class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stck=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!stck.isEmpty() && stck.peek()<= nums2[i]){
                stck.pop();
            }
            int nge=stck.isEmpty()?-1:stck.peek();
            hm.put(nums2[i],nge);
            stck.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}