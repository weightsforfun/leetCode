import java.util.*;
class Solution {
    public int[] parent;
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        parent[x]=find(parent[x]);
        return parent[x];
    }
    public boolean merge(int x,int y){
        x=find(x);
        y=find(y);
        if(x==y){
            return false;
        }
        if(x<y){
            parent[y]=x;
        }
        else{
            parent[x]=y;
        }
        return true;
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        
        parent=new int[n+1];
        for(int i=0;i<n+1;i++){
            parent[i]=i;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && parent[i+1]!=parent[j+1]){
                    merge(i+1,j+1);
                }
            }
            
        }
        
        int answer=1;
        for(int i=1;i<n;i++){
            find(i);
        }
        // for (int i:parent){
        //     System.out.print(" "+i);
        // }
        Set<Integer> hs=new HashSet<>();
        for(int i:parent){
            hs.add(i);
        }
        return hs.size()-1;
    }
}