class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r=new ArrayDeque<>();
        Queue<Integer> d=new ArrayDeque<>();
        int len=senate.length();
        for(int i=0;i<senate.length();i++){
            char c=senate.charAt(i);
            if(c=='R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int dturn=d.remove();
            int rturn=r.remove();

            if(rturn<dturn) r.add(dturn+len);
            else d.add(rturn+len);
        }
        return r.isEmpty()?"Dire":"Radiant";
    }
}