import java.util.*;
class Solution {
    public int target;
    public int limit;
    public List<List<Integer>> answer= new ArrayList<>();
    
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        target=n;
        limit=k;
        Deque<Integer> deq=new ArrayDeque<>();
        dfs(0,0,0,deq);
        return answer;
    }
    
    public void dfs(int depth,int sum,int start,Deque<Integer> stack){
        if(sum==target && depth==limit){
            List<Integer> newStack=new ArrayList<>(stack);
            
            answer.add(newStack);
            return ;
        }
        if(sum>target){
            return ;
        }
        for(int i=start+1;i<10;i++){
            stack.addLast(i);
            dfs(depth+1,sum+i,i,stack);
            stack.pollLast();
        }
        
    }
}