class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int longest=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        for(int num:nums){
            if(!set.contains(num-1)){
                //int x=num;
                int cnt=1;
                while(set.contains(num+cnt)){
                    //x+=1;
                    set.remove(num+cnt);
                    cnt+=1;
                    
                }
                longest=Math.max(longest,cnt);
            }

        }
        return longest;
    }
}