class Solution {
    public int[] closestPrimes(int left, int right) {
        //boolean arr[]=new boolean[right+1];
        List<Integer> res=new ArrayList<>();
        // Arrays.fill(arr,true);
        // arr[0]=arr[1]=false;
        for(int i=left;i<=right;i++){
            if(isprime(i)){
                res.add(i);
            }
        }
        if(res.size()<2){
            return new int[]{-1,-1};
        }

        int mingap=Integer.MAX_VALUE;
        int[] ans=new int[2];

        for(int i=1;i<res.size();i++){
            int gap=res.get(i)-res.get(i-1);
            if(gap<mingap){
                mingap=gap;
                ans[0]=res.get(i-1);
                ans[1]=res.get(i);
            }
        }
        return ans;
    }
    private boolean isprime(int num){
        if(num<=1){return false;}
        for(int i=2;i*i<=num;i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}