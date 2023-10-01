import java.io.*;
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1){
            return true;
        }
        
        boolean[] arr = new boolean[n];
        Arrays.fill(arr,false);
        
        int max=0;
        
        for(int i=0;i<n;i++){
            
            max=Math.max(max,nums[i]);
            if(max>0 || i==n-1){
                max--;
                arr[i]=true;
            }
            else{
                break;
            }
        }
        
        return arr[n-1];
    }
}