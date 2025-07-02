class Solution {
    public int[] asteroidCollision(int[] arr) {
       // List<Integer> list=new ArrayList<>();
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) stck.push(arr[i]);
            else{
                while(!stck.isEmpty() && stck.peek() > 0 && stck.peek() < Math.abs(arr[i]))
                    stck.pop();
                
                if(stck.isEmpty() || stck.peek()<0) stck.push(arr[i]);
                if(!stck.isEmpty() && -arr[i] == stck.peek()) stck.pop();
                
            }
        }
        int[] ans=new int[stck.size()];
        int i=0;
        for(int num:stck){
            ans[i++]=num;
        }
        return ans;
    }
}