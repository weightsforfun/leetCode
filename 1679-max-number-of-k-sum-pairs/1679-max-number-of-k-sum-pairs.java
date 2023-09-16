import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        int answer=0;
        
        int left=0;
        int right=n-1;
        
        Arrays.sort(nums);
        
        while(left<right){
            int sum=nums[left]+nums[right];
            
            if(sum==k){
                answer++;
                left++;
                right--;
            }
            else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
        return answer;
    }
}