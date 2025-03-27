class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        for(int num:nums1)
        {
            n1.add(num);
        }
        for(int num:nums2){
            n2.add(num);
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int num:n1)
        {
            if(!n2.contains(num)) list1.add(num);
        }
        for(int num:n2)
        {
            if(!n1.contains(num)) list2.add(num);
        }
        return Arrays.asList(list1,list2);
    }
}