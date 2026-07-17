class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=Integer.MIN_VALUE;
        int l=0,r=n-1;
        while(l<r){
            int w=r-l;
            int h=Math.min(height[l],height[r]);
            int area=w*h;
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r])
                l++;
            else 
               r--;
        }
        return maxArea;
    }
}