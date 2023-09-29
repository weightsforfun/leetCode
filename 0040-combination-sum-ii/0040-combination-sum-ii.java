import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> answer=new ArrayList<>();
        Deque<Integer> deq=new ArrayDeque<>();
        dfs(deq,answer,candidates,target,0,0);
        return answer;
    }
    public void dfs(Deque<Integer> deq, List<List<Integer>> answer,int[] candidates,int target,int start,int sum){
        if(target==sum){
            answer.add(new ArrayList<>(deq));
        }
        else if(target<sum){
            return ;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            deq.addLast(candidates[i]);
            dfs(deq,answer,candidates,target,i+1,sum+candidates[i]);
            deq.pollLast();
        }
    }
}