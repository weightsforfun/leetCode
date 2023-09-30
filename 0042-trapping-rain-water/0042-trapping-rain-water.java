import java.util.*;
class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxLeft=0;
        int maxRight=0;
        int answer=0;
        while(left<=right){
            // System.out.println(answer);
            if(maxLeft<maxRight){
                int now=height[left];
                if(now<maxLeft){
                    answer+=(maxLeft-now);
                }
                else{
                    maxLeft=now;
                }
                left++;
            }   
            else{
                int now=height[right];
                if(now<maxRight){
                    answer+=(maxRight-now);
                }
                else{
                    maxRight=now;
                }
                right--;
            }
        }
        return answer;
        
    }
}