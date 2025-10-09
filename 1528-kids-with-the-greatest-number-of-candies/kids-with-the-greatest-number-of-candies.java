class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=Arrays.stream(candies).max().getAsInt();
        for(int candy:candies){
            if(candy+extraCandies >=max){
                ans.add(true);
            }else ans.add(false);
        }
        return ans;
    }
}