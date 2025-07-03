class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stck=new Stack<>();
        int max=0;
        for(int i=0;i<heights.length;i++){
            
            while(!stck.isEmpty() && heights[stck.peek()]> heights[i]){

                int ele=heights[stck.pop()];
                int nse=i;
                int pse=stck.isEmpty()? -1: stck.peek();

                max=Math.max(max,ele*(nse - pse - 1));
            }
            stck.push(i);
        }
        while(!stck.isEmpty()){
            int nse=heights.length;
            int ele=heights[stck.pop()];
            int pse=stck.isEmpty()? -1: stck.peek();

            max=Math.max(max,ele*(nse - pse - 1));
        }

        return max;
    }
}