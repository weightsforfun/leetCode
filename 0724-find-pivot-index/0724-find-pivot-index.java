import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        
        for(int i=0;i<n-1;i++){
            nums[i+1]=nums[i+1]+nums[i];
        }
        
        for(int i=0;i<n;i++){
            int left=0;
            int right=0;
            if(i==0){
                left=0;
                right=nums[n-1]-nums[i];
            }
            else if(i==n-1){
                left=nums[i-1];
                right=0;
            }
            else{
                left=nums[i-1];
                right=nums[n-1]-nums[i];
            }
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}