import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        
        for(int num: nums){
            pq.add(-1*num);
        }
        
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll()*-1;
    }
}