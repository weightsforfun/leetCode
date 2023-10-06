class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n=nums.length;
        int [] answer=new int [] {-1,-1};
        
        if(n==0) return answer;
        
        int left=0;
        int right=n-1;
        int flag=0;
        
        while(left<=right){
            int middle=left+(right-left)/2;
            if(nums[middle]<=target){
                
                if(nums[middle]==target) flag=1;
                
                left=middle+1;
            }
            else{
                right=middle-1;
            }
        }
        
        if(flag==0) return answer;
        answer[1]=right;
        
        left=0;
        right=n-1;
        
        while(left<=right){
            int middle=left+(right-left)/2;
            if(nums[middle]>=target){
                
                if(nums[middle]==target) flag=1;
                
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        
        answer[0]=left;
        return answer;
        
    }
}