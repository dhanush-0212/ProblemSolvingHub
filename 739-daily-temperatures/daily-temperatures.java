class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> stck=new Stack<>();

        for(int i=temperatures.length-1;i>=0;i--){
            
            while(!stck.isEmpty() && temperatures[stck.peek()]<= temperatures[i]){
                stck.pop();
            }
            if(!stck.isEmpty()) ans[i]=stck.peek()-i;
            stck.push(i);
        }
        return ans;
    }
}