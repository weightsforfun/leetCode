import java.util.*;

class Solution {
    public String removeStars(String s) {
        
        Deque<Character> deq=new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c=='*'){
                deq.pollLast();
            }
            else{
                deq.addLast(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!deq.isEmpty()){
            sb.append(deq.pollFirst());
        }
        return sb.toString();
    }
}