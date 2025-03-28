class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
           if(asteroids[i]>0) stck.push(asteroids[i]);
           else{
             while(!stck.isEmpty() && stck.peek() > 0 
                                    && stck.peek() < Math.abs(asteroids[i]))
                {
                    stck.pop();
                }
             if(stck.isEmpty()|| stck.peek() <0){
                stck.push(asteroids[i]);
             }
             if(stck.peek()==-asteroids[i]){
                stck.pop();
             }
           }
        }
       int[] res = new int[stck.size()];
        int i = stck.size() - 1;

        while(!stck.isEmpty()) {
            res[i--] = stck.pop();
        }

        return res;
    }
}