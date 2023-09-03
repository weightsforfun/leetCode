import java.util.*;
class Solution {
    public static void dfs(int index,List<List<Integer>> rooms){
        visited[index]=1;
        answer++;
        for(int key:rooms.get(index)){
            if(visited[key]==0){
                dfs(key,rooms);
            }
        }
    }
    public static int answer;
    
    public static int [] visited;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited=new int[rooms.size()];
        
        dfs(0,rooms);
        
        for(int v:visited){
            if(v==0){
                return false;
            }
        }
        return true;
    }
    
}