class Solution {
    public int myAtoi(String s) {
      s=s.trim();
      int sign=1;
      int i=0;
      long ans=0;

      if(s.length()==0) return 0;

      if(s.charAt(0)=='-') {sign=-1; i++;}
      else if(s.charAt(0)=='+') i++;

      return (int) helper(s,i,ans,sign);
    }
    public long helper(String s,int i,long ans,int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))) return ans*sign;

        ans=ans*10+(s.charAt(i)- '0');
         if(sign == 1 && ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign == -1 && (sign * ans) < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return helper(s,i+1,ans,sign);
    }
}