import java.util.*;
class Solution {
    public int n;
    public int m;
    public int [][] ma;
    public int [][] dp;
    public class Node{
        int y;
        int x;
        public Node(int y,int x){
            this.y=y;
            this.x=x;
        }
    }
    public int[] dy={1,-1,0,0};
    public int[] dx={0,0,1,-1};
    public int longestIncreasingPath(int[][] matrix) {
        
        m=matrix.length;
        n=matrix[0].length;
        
        ma=new int[m][n];
        dp=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ma[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(new Node(i,j));
            }
        }
        
        int answer=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                answer=Math.max(answer,dp[i][j]);
            }
        }
        
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(" "+dp[i][j]);
        //     }
        //     System.out.println(" ");
        // }
        
        return answer;
        
    }
    public int dfs(Node now){
        if(dp[now.y][now.x]!=0){
            return dp[now.y][now.x];
        }
        for(int i=0;i<4;i++){
            int ny=now.y+dy[i];
            int nx=now.x+dx[i];
            if(ny>=0 && ny<m && nx>=0 && nx<n && ma[ny][nx]>ma[now.y][now.x]){
                dp[now.y][now.x]=Math.max(dp[now.y][now.x],dfs(new Node(ny,nx))+1);
            }
        }
        return dp[now.y][now.x]=Math.max(dp[now.y][now.x],1);
    }
}