import java.util.*;
class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int right=k-1;
        int count=0;
        int answer=0;
        
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        char [] arr=s.toCharArray();
        
        for(int i=0;i<k;i++){
            if(set.contains(arr[i])){
                count++;
            }
        }
        
        answer=count;
        
        while(right<s.length()-1){
            if(set.contains(arr[left])){
                count--;
            }
            left++;
            right++;
            if(set.contains(arr[right])){
                count++;
            }
            answer=Math.max(answer,count);
        }
        return answer;
    }
}