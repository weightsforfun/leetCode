import java.util.*;
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n];
        
        Arrays.fill(dp,10001);
        dp[0]=0;
        
        for(int i=0;i<n;i++){
            for(int j=1;j<=nums[i];j++){
                if(i+j>n-1){
                    break;
                }
                dp[i+j]=Math.min(dp[i+j],dp[i]+1);
            }
        }
        
        return dp[n-1];
    }
}