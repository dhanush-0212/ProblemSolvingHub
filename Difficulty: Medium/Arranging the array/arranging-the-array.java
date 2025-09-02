// User function Template for Java

class Solution {

    public void Rearrange(int arr[], int n) {
        // Your code goes here
        List<Integer> neg=new ArrayList<>();
        List<Integer> nonNeg=new ArrayList<>();
        for(int num:arr){
            if(num<0) neg.add(num);
            else nonNeg.add(num);
        }
        int idx=0;
        for(int num:neg) arr[idx++]=num;
        for(int num:nonNeg) arr[idx++]=num;
    }
}