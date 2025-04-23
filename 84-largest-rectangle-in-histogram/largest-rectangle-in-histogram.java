class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] nse=findnse(heights);
        int[] pse=findpse(heights);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            ans=Math.max(ans,heights[i]*(nse[i]-pse[i]-1));
        }
        return ans;
    }
    public int[] findpse(int[] height){
       // int i=0;
        Stack<Integer> stck=new Stack<>();
        int[] arr=new int[height.length];
        for(int i=0;i<height.length;i++){
            int num=height[i];
            while(!stck.isEmpty() && height[stck.peek()] >= num){
                stck.pop();
            }
            int nle=stck.isEmpty()?-1:stck.peek();
            arr[i]=nle;
            stck.push(i);
        }
        return arr;
    }
    public int[] findnse(int[] height){
        //int i=0;
        Stack<Integer> stck=new Stack<>();
        int[] arr=new int[height.length];
        int n=height.length;
        for(int i=n-1;i>=0;i--){
            int num=height[i];
            while(!stck.isEmpty() && height[stck.peek()] >= num){
                stck.pop();
            }

            int nle=stck.isEmpty()?n:stck.peek();
            arr[i]=nle;
            stck.push(i);
        }
        return arr;
    }
}