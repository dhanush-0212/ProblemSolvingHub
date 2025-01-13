class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int value=0,result=0;
        for(char c:map.keySet()){
            value=map.get(c);
            value=value %2==0?2:1;
            result+=value;
        }
        return result;
    }
}