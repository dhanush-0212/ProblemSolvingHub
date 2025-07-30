class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> need = new HashMap<>();        
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        Map<Character, Integer> currentSlide = new HashMap<>();
        int l=0;
        int formed=0;
        int required=need.size();
        int minlen=Integer.MAX_VALUE; 
        int minleft=0;
       
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            currentSlide.put(c,currentSlide.getOrDefault(c,0)+1);

            if(need.containsKey(c) && need.get(c).intValue() == currentSlide.get(c).intValue()){
                formed++;
            }

            while(formed==required){

                char ch=s.charAt(l);
                currentSlide.put(ch,currentSlide.get(ch)-1);

                if(r-l+1<minlen){
                    minlen=r-l+1;
                    minleft=l;
                }

                if(need.containsKey(ch) && currentSlide.getOrDefault(ch, 0).intValue()<need.get(ch).intValue()){
                    formed--;
                }

                l++;
            }
        }
        //if (minlen == Integer.MAX_VALUE) return "";
        return minlen == Integer.MAX_VALUE? "" :s.substring(minleft, minleft + minlen);

    }
}