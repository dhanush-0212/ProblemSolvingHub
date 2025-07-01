class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] nse=findnse(arr,n);
        int pse[]=findpse(arr,n);
        long tot=0;
        long mod=(long) 1e9+7;

        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right= nse[i]-i;
            tot = (tot + (right * 1L * left * arr[i]) % mod ) % mod;
            
        }
        return (int)tot;
    }
    private int[] findnse(int[] arr,int n){
         
        int[] ans=new int[arr.length];
        Stack<Integer> stck=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!stck.isEmpty() && arr[stck.peek()]>= arr[i]) stck.pop();
            int nse=stck.isEmpty()? n:stck.peek();
            ans[i]=nse;
            stck.push(i);
        }
        return ans;
    }
    private int[] findpse(int[] arr,int n){
        int[] ans=new int[n];
        Stack<Integer> stck=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && arr[stck.peek()] > arr[i]) stck.pop();
            int pse=stck.isEmpty()? -1 : stck.peek();
            ans[i]=pse;
            stck.push(i);
        }
        return ans;
    }
}