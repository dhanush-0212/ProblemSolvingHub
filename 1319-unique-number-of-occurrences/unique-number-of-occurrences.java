class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int num:arr){
            hm.merge(num,1,Integer::sum);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(hs.contains(entry.getValue())){
                return false;
            }
            hs.add(entry.getValue());
        }
        return true;
    }
}