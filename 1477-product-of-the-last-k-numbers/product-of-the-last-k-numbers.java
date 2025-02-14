class ProductOfNumbers {
    ArrayList<Integer> prefix;
    int prod=1;
    public ProductOfNumbers() {
        prefix=new ArrayList<>();
    }
    
    public void add(int num) {
         if(num == 0){
            prefix = new ArrayList<>();
            prod = 1;
            return;
        }
        prod = prod * num;
        prefix.add(prod);
    }
    
    public int getProduct(int k) {
        if(prefix.size()<k){return 0;}
        int ans=prefix.get(prefix.size()-1);
        if(prefix.size()==k){return ans;}
        return ans/prefix.get(prefix.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */