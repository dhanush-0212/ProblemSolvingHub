class Solution {
    public String reverseVowels(String s) {
        char [] str=s.toCharArray();
        int i=0,j=s.length()-1,n=s.length();
        while(i<j){
            while(i<j && !isvowel(str[i])) i++;
            while(i<j && !isvowel(str[j])) j--;

            //swap
            char ch=str[i];
            str[i]=str[j];
            str[j]=ch;

            i++;
            j--;
        }
        return new String(str);
    }
    public boolean isvowel(char Char){
        return (Char == 'a' || Char == 'A') 
            || (Char == 'e' || Char == 'E')
            || (Char == 'i' || Char == 'I')
            || (Char == 'o' || Char == 'O')
            || (Char == 'u' || Char == 'U');
    }
}