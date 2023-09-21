import java.util.*;
class Solution {
    public int minDistance(String word1, String word2) {
        char [] arr1=word1.toCharArray();
        char [] arr2=word2.toCharArray();
        
        if(arr1.length==0 || arr2.length==0){
            return Math.max(arr1.length,arr2.length);
        }
        
        int [][] dp= new int[arr1.length+1][arr2.length+1];
        
        for(int i=0;i<arr1.length+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<arr2.length+1;i++){
            dp[0][i]=i;
        }
        
        for(int i=1;i<arr1.length+1;i++){
            for(int j=1;j<arr2.length+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    
                }
            }
        }
        return dp[arr1.length][arr2.length];
        
    }
}