class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.add(t);
        int count=0;
        int range=t-3000;
        for(int num:q){
            if(num>=range && num<=t) count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */