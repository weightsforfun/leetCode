class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        
        while(left<right){
            int middle=left+(right-left)/2;
            if(nums[middle]>nums[right]) left=middle+1;
            else right=middle;
        }
        
        int minIndex=left;
        left=0;
        right=n-1;
        // System.out.println(minIndex);
        if(nums[right]==target){
            return right;
        }
        if(nums[right]>target){
            left=minIndex;
        }
        else{
            right=minIndex;
        }
        while(left<=right){
            int middle=left+(right-left)/2;
            if(nums[middle]==target) return middle;
            else if(nums[middle]<target) left=middle+1;
            else right=middle-1;
        }
        return -1;
    }
}