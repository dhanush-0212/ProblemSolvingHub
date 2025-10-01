class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int diag=triangle.get(i+1).get(j+1);
                int down=triangle.get(i+1).get(j);
                int curr=triangle.get(i).get(j);
                int sum=Math.min(diag,down)+curr;
                triangle.get(i).set(j,sum);
            }
        }
        return triangle.get(0).get(0);
    }
}