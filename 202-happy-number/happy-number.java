class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
        n=helper(n);
        if(n==1) return true;
        }
        return false;
    }
    public int helper(int n){

        int output=0;
        while(n>0){
            int digit=n%10;
            output+=digit*digit;
            n=n/10;
        }
        return output;
    }
}