import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int right=k-1;
        int sum=0;
        
        for(int i=0;i<=right;i++){
            sum+=nums[i];
        }
        int answer=sum;
        while(right<nums.length-1){

            sum-=nums[left];
            left++;
            right++;
            sum+=nums[right];
            answer=Math.max(answer,sum);
        }
        
        return (double)(answer/(double)k);
    }
}