class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;
        int [] prefix=new int [n+1];
        int answer=0;
        for(int i=1;i<n+1;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
            answer=Math.max(prefix[i],answer);
        }
        return answer; 
    }   
}