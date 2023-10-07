import java.util.*;
class Solution {
    public String countAndSay(int n) {
        Deque<Character> deq=new ArrayDeque<>();
        
        deq.addLast('1');
        
        for(int i=1;i<n;i++){
            int len=deq.size();
            while(!deq.isEmpty()){
                char c=deq.pollFirst();
                int count=1;
                len--;
                while(!deq.isEmpty() && c==deq.getFirst()){
                    if(len==0) break;
                    count++;
                    len--;
                    deq.pollFirst();
                    
                }
                deq.addLast((char)(count+'0'));
                deq.addLast(c);
                if(len==0) break;
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!deq.isEmpty()){
            sb.append(deq.pollFirst());
        }
        return sb.toString();
    }
}