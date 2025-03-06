class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int miss=0, repeat=0;

        Map<Integer,Integer> hm=new HashMap<>();
        for(int[] row:grid){
            for(int num:row){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
        }
        for(int num=1;num<=n*n;num++){
            if(!hm.containsKey(num)){
                miss=num;
            }
            else if(hm.get(num)==2){
                repeat=num;
            }
        }
        return new int[]{repeat,miss};
    }
}