import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        int n=asteroids.length;
        
        Deque<Integer> deq=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            int now=asteroids[i];
            while(true){
                if(deq.isEmpty()){
                    deq.addLast(now);
                    break;
                }
                int top=deq.getLast();
                if(top*now>0 || (now>0 && top<0)){
                    deq.addLast(now);
                    break;
                }
                else{
                    if(Math.abs(top)>Math.abs(now)){
                        break;
                    }
                    else if(Math.abs(top)==Math.abs(now)){
                        deq.pollLast();
                        break;
                    }
                    else{
                        deq.pollLast();
                    }
                }    
            }
        }
        
        int [] answer= new int[deq.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=deq.pollFirst();
        }
        
        return answer;
    }
}