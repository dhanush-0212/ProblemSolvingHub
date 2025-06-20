class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans=new ArrayList<>();
        if(digits == null || digits.length()==0) return ans;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        helper(0,digits,map,ans,new StringBuilder());
        return ans;
    }

    public void helper(int idx,String digits, Map<Character, String> map,List<String> ans,StringBuilder comb){

        if(idx==digits.length()){
            ans.add(comb.toString());
            return;
        }


        String  letters=map.get(digits.charAt(idx));
        for(char c:letters.toCharArray()){
            comb.append(c);
            helper(idx+1,digits,map,ans,comb);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}