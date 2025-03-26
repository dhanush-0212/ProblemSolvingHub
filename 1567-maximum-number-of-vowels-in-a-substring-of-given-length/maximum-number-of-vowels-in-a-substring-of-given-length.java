class Solution {
    public int maxVowels(String s, int k) {
        //if(s.length()==1) retrun
        int l=0;
        int vowel=0,ans=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(isvowel(c)){
                vowel+=1;
            }
            while(r-l+1 > k){
                if(isvowel(s.charAt(l))) vowel-=1;
                ans=Math.max(vowel,ans);
                l++;
            }
            ans=Math.max(ans,vowel);
        }
        return ans;
    }
    public boolean isvowel(char c){
        if(c=='a'|| c=='e'|| c=='i'|| c=='o' || c=='u'){
            return true;
        }
        return false;
    } 
}