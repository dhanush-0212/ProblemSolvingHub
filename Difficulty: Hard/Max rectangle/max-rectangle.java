class Solution {
    static int maxArea(int mat[][]) {
        // code here\
        List<Integer> list=new ArrayList<>();
        int[] arr=new int[mat[0].length];
        int maxArea=0;
        for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1) arr[j]++;
               else arr[j]=0;
           }
           int area=histogram(arr);
           maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    static int histogram(int[] arr){
        Stack<Integer> stck=new Stack<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            
            while(!stck.isEmpty() && arr[stck.peek()] >arr[i]){
                
                int ele=arr[stck.pop()];
                int nse=i;
                int pse=stck.isEmpty()?-1:stck.peek();
                
                max=Math.max(max,ele*(nse-pse-1));
            }
            stck.push(i);
        }
         while(!stck.isEmpty()){
            int nse=arr.length;
            int ele=arr[stck.pop()];
            int pse=stck.isEmpty()? -1: stck.peek();

            max=Math.max(max,ele*(nse - pse - 1));
        }
        return max;
    }
}