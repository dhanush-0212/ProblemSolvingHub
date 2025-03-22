class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<pair> pq=new PriorityQueue<>(
            (a,b)-> b.freq-a.freq
        );
        int[] ans=new int[k];
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.remove().num;
        }
        return ans;
    }
}
class pair{
    int num;
    int freq;
    pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
}