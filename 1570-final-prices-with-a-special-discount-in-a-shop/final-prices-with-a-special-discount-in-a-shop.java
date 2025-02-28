class Solution {
    public int[] finalPrices(int[] prices) {
       Stack<Integer> stck=new Stack<>();

       for(int i=prices.length-1;i>=0;i--){
        while(!stck.isEmpty() && prices[i]<stck.peek()){
            stck.pop();
        }
        int discount=stck.isEmpty()?0:stck.peek();
        stck.push(prices[i]);
        prices[i]=prices[i]-discount;
       }
       return prices;
    }
}