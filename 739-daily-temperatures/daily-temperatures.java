class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stck=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && temperatures[stck.peek()] <= temperatures[i]) stck.pop();
            if(!stck.isEmpty())
                ans[i]=stck.peek()-i;
            stck.push(i);
        }
        return ans;
    }
}