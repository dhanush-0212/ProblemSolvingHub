// User function Template for Java

class Solution {
    static long count(int n) {
        // code here
        if(n<=2) return n;
        return (1 <<(n-1))*count(n-1);
    }
}
