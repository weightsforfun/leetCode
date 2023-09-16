import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=0;
        
        for(int i=0;i<n;i++){
            max=Math.max(candies[i],max);
        }
        
        List<Boolean> answer=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                answer.add(true);    
            }
            else{
                answer.add(false);
            }
            
        }
        return answer;
    }
}