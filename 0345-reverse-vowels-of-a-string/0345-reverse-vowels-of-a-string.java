import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        
        int left=0;
        int right=s.length()-1;
        
        if(s.length()==1){
            return s;
        }
        
        char[] arr=s.toCharArray();
        
        while(left<right){
            if(set.contains(arr[left]) && set.contains(arr[right])){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(set.contains(arr[left]) && !set.contains(arr[right])){
                right--;
            }
            else if(!set.contains(arr[left]) && set.contains(arr[right])){
                left++;
            }
            else{
                left++;
                right--;
            }
        }
        StringBuilder sb= new StringBuilder();
        for(char c:arr){
            sb.append(c);
        }  
        return sb.toString();
    }
}