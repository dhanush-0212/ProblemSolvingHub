class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));

        for(int i=0;i<numRows-1;i++){
            List<Integer> prev=list.get(list.size()-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(0);
            curr.addAll(prev);
            curr.add(0);
            List<Integer> newrow=new ArrayList<>();
            for(int j=0;j<curr.size()-1;j++){
                newrow.add(curr.get(j)+curr.get(j+1));
            }
            list.add(newrow);
        }
        return list;
    }
}