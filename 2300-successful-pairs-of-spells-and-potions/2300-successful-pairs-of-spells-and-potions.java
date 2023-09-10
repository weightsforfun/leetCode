class Solution {
    
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n=spells.length;
        int m=potions.length;
        int [] answer = new int[n];
        Arrays.sort(potions);
        
        for(int i=0;i<n;i++){
            long spell=(long) spells[i];
            int left=0;
            int right=m-1;
            int index=m;
            while(left<=right){
                int middle=(left+right)/2;
                if(potions[middle]*spell==success){
                    index=middle;
                    right=middle-1;
                }
                else if(potions[middle]*spell<success){
                    left=middle+1;
                }
                else{
                    index=middle;
                    right=middle-1;
                    
                }
            }
            
            answer[i]=m-index;
            
        }
        
        return answer;
        
    }
}