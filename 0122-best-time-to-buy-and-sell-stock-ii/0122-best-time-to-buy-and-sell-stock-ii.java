import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        
        if(n==1) return 0;
        if(n==2) return Math.max(0,prices[1]-prices[0]);
        
        int [] dp= new int[n];
        for(int i=0;i<n;i++){
            dp[i]=Math.max(prices[i]-prices[0],0);
        }
        for(int i=1;i<n;i++){
            dp[i]=Math.max(prices[i]-prices[1],dp[i]);
            dp[i]=Math.max(dp[i],dp[i-1]);
        }
        
        for(int i=2;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                
                dp[j]=Math.max(dp[j],prices[j]-prices[i]+dp[i-1]);
                dp[j]=Math.max(dp[j],dp[j-1]);
            }
            // for(int p:dp){
            //     System.out.print(" "+p);
            // }
            // System.out.println(" ");
        }
        
        
        int answer=0;
        for(int d:dp){
            answer=Math.max(answer,d);
        }
        return answer;
    }
}