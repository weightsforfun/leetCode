import java.util.*;
class Solution {
    class Node{
        int y;
        int x;
        int count;
        public Node(int y,int x,int count){
            this.y=y;
            this.x=x;
            this.count=count;
        }
    }
    int [] dy={1,-1,0,0};
    int [] dx={0,0,1,-1};
    
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        
        int[][] arr=new int[m][n];
        Deque<Node> deq= new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    arr[i][j]=0;
                    deq.addLast(new Node(i,j,0));
                }
                else{
                    arr[i][j]=-1;
                }
            }
        }
        
        while(!deq.isEmpty()){
            Node now = deq.pollFirst();
            for(int i=0;i<4;i++){
                int ny=now.y+dy[i];
                int nx=now.x+dx[i];
                if(ny>=0 && ny<m && nx>=0 && nx<n && arr[ny][nx]<0){
                    arr[ny][nx]=now.count+1;
                    deq.addLast(new Node(ny,nx,now.count+1));
                }
            }
        }
        return arr;
    }
}