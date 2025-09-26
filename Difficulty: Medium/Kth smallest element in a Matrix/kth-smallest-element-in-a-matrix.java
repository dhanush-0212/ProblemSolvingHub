class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> stck=new PriorityQueue<>((a,b)-> b-a);
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                stck.add(mat[i][j]);
                if(stck.size()>k){
                    stck.remove();
                }
            }
        }
        return stck.peek();
    }
}
