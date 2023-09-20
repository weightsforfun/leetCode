import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();
        
        for(int num1 : nums1){
            set1.add(num1);
        }
        
        for(int num2 : nums2){
            set2.add(num2);
        }
        
        List<List<Integer>> answer=new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        
        for(int num1 : set1){
            if(!set2.contains(num1)){
                answer.get(0).add(num1);    
            }
        }
        for(int num2 : set2){
            if(!set1.contains(num2)){
                answer.get(1).add(num2);    
            }
        }
        return answer;
    }
}