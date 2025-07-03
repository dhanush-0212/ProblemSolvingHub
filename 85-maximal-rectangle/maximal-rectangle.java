class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] psum=new int[row][col];
        int max=0;

        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum+= matrix[i][j] -'0';
                if(matrix[i][j]== '0') sum=0;
                psum[i][j]=sum;
                System.out.println(sum);
            }
        }

        for(int i=0;i<row;i++){
            max=Math.max(max,histogram(psum[i]));
        }
        return max;
    }

    public int histogram(int[] arr){

        int max=0;
        int n=arr.length;
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && arr[stck.peek()] > arr[i]){
                int ele=arr[stck.pop()];
                int nse=i;
                int pse=stck.isEmpty() ? -1: stck.peek();

                max=Math.max(max,ele*(nse-pse-1));
            }
            stck.push(i);
        }
        while(!stck.isEmpty()){
            int nse=n;
            int ele=arr[stck.pop()];
            int pse=stck.isEmpty() ? -1:stck.peek();
            max=Math.max(max,ele*(nse-pse-1));
        }
        return max;
    }
}