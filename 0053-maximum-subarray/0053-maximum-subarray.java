import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int [] dp=new int[n];
        
        dp[0]=nums[0];
        
        for(int i=1;i<n;i++){
            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
        }
        int answer=-10001;
        for(int d: dp){
            answer=Math.max(answer,d);
        }
        return answer;
    }
}