import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        int[] visited=new int[n];
        List<List<Integer>> answer=new LinkedList<>();
        List<Integer> now=new LinkedList<>();
        Arrays.sort(nums);
        dfs(answer,now,nums,visited,0);
        return answer;
        
    }
    public void dfs(List<List<Integer>> answer,List<Integer> now ,int [] nums,int[] visited,int depth){
        // System.out.println(now);
        if(depth==nums.length){
            answer.add(new LinkedList<>(now));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==0 && !(i>0 && nums[i]==nums[i-1] && visited[i-1]==0)){
                visited[i]=1;
                now.add(nums[i]);
                dfs(answer,now,nums,visited,depth+1);
                now.remove(now.size()-1);
                visited[i]=0;
            }
        }
    }
}