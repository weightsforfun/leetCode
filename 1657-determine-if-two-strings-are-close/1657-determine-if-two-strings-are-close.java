import java.util.*;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        
        for(int i=0;i<arr1.length;i++){
            if(map1.containsKey(arr1[i])){
                map1.put(arr1[i],map1.get(arr1[i])+1);
            }
            else{
                map1.put(arr1[i],1);
            }
            if(map2.containsKey(arr2[i])){
                map2.put(arr2[i],map2.get(arr2[i])+1);
            }
            else{
                map2.put(arr2[i],1);
            }
        }
        if(map1.size()!=map2.size()){
            return false;
        }
        for(Character c:map1.keySet()){
            if(!map2.containsKey(c)){
                return false;
            }
        }
        for(Character c:map2.keySet()){
            if(!map1.containsKey(c)){
                return false;
            }
        }
        
        
        Map<Integer,Integer> map3=new HashMap<>();
        Map<Integer,Integer> map4=new HashMap<>();
            
        for(Character c : map1.keySet()){
            int temp=map1.get(c);
            if(map3.containsKey(temp)){
                map3.put(temp,map3.get(temp)+1);
            }
            else{
                map3.put(temp,1);
            }
        }
        for(Character c : map2.keySet()){
            int temp=map2.get(c);
            if(map4.containsKey(temp)){
                map4.put(temp,map4.get(temp)+1);
            }
            else{
                map4.put(temp,1);
            }
        }
        for(int i:map3.keySet()){
            if(!map4.containsKey(i)){
                return false;
            }
            if(map4.get(i)!=map3.get(i)){
                return false;
            }
        }
        for(int i:map4.keySet()){
            if(!map3.containsKey(i)){
                return false;
            }
            if(map4.get(i)!=map3.get(i)){
                return false;
            }
        }
        return true;
    }
}