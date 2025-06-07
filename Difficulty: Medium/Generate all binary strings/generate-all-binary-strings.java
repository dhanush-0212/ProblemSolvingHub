// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> list=new ArrayList<>();
        helper(list,"",n);
        return list;
    }
    public static void helper(List<String> list,String bin,int n){
        
        if(bin.length()==n){
            list.add(bin);
            return;
        }
        
        helper(list,bin+'0',n);
        if(bin.isEmpty() || bin.charAt(bin.length()-1) != '1'){
            helper(list,bin+'1',n);
        }
    }
}
