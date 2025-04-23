class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ele=0;
        int nse=0,pse=0;
        int ans=0;
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<n;i++){
            int num=heights[i];
            while(!stck.isEmpty() && heights[stck.peek()] >= num ){
                ele=stck.pop();
                nse=i;
                pse=stck.isEmpty()?-1:stck.peek();
                int width=nse-pse-1;
                ans=Math.max(ans,heights[ele]*width);
            }
            
            stck.push(i);
        }
        while(!stck.isEmpty()){
            ele=stck.pop();
            nse=n;
            pse=stck.isEmpty()?-1:stck.peek();
            int width=nse-pse-1;
            ans=Math.max(ans,heights[ele] * width);
        }
        return ans;
    }
}