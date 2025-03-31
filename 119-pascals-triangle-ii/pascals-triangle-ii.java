class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<Integer>(Arrays.asList(1)));
        return helper(list,rowIndex);
    }
    public List<Integer>  helper(List<List<Integer>> list,int row){
        int j=0;
        while(j<row){
            List<Integer> prev=list.get(list.size()-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(0);
            curr.addAll(prev);
            curr.add(0);
            List <Integer>  newrow=new ArrayList<>();
            for(int i=0;i<curr.size()-1;i++){
                newrow.add(curr.get(i)+curr.get(i+1));
            }
            list.add(newrow);
            j++;
        }   
        return list.get(list.size()-1);
    }
}