class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() % 2 !=0) return false;
        int n=s.length();
        int wildcard=0,opening=0,closing=0;
        for(int i=0;i<n;i++){
            if(locked.charAt(i) == '0') wildcard++;
            else if(s.charAt(i) == '(') opening++;
            else closing++;
            if(wildcard<(closing-opening)) return false;
        }
        wildcard = 0;
        opening = 0;
        closing = 0;

        for(int i=n-1;i>=0;i--){
            if(locked.charAt(i) == '0') wildcard++;
            else if(s.charAt(i)== '(') opening++;
            else closing++;
            if(wildcard<(opening-closing)) return false;
        }
        return true;
    }
}