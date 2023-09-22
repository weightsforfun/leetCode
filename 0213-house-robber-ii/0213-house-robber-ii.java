class Solution {
    public int rob(int[] nums) {
        int answer=0;
        int n= nums.length;
        
        if(n==1){
            return nums[0];
        }
        //1번집 무조건 선택
        nums[0]+=1000;
        
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        answer=Math.max(answer,Math.max(dp[n-1],dp[n-2])-1000);
        
        // 1번집 무조건 제외
        nums[0]=0;
        dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        answer=Math.max(answer,Math.max(dp[n],dp[n-1]));
        return answer;
        
        
    }
}