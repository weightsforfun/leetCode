import java.util.*;
class RecentCounter {
    
    public static Deque<Long> que=new ArrayDeque<>();

    public RecentCounter() {
        que.clear();
    }
    
    public int ping(int t) {
        que.add((long) t);
        long min=(long)t-3000;
        while(que.peekFirst()<min){
            que.pollFirst();
        }
        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */