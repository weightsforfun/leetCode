class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int answer=0;
        while(left<right){
            int lh=height[left];
            int rh=height[right];
            int th=Math.min(lh,rh);
            answer=Math.max(answer,(th*(right-left)));
            if(lh>rh){
                right--;
            }
            else{
                left++;
            }
        }
        return answer;
    }
}