class Solution {
    class Node{
        int y;
        int x;
        Node(int y, int x){
            this.y=y;
            this.x=x;
        }
    }
    public boolean answer=false;
    public int[][] visited;
    public int[] dy={1,-1,0,0};
    public int[] dx={0,0,1,-1};
    public int n;
    public int m;
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        int depth=0;
        visited=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && !answer){
                    visited[i][j]=1;
                    back(new Node(i,j),0,word,board);
                    visited[i][j]=0;
                }
            }
        }
        
        return answer;
        
        
        
    }
    public void back(Node start,int depth,String word,char[][] board){
        if(depth==word.length()-1){
            answer=true;
            return;
        }
            
        for(int i=0;i<4;i++){
             int ny=start.y+dy[i];
             int nx=start.x+dx[i];
             if(ny>=0 && ny<m && nx>=0 && nx<n && visited[ny][nx]==0  &&board[ny][nx]==word.charAt(depth+1)){
                 visited[ny][nx]=1;
                 back(new Node(ny,nx),depth+1,word,board);
                 visited[ny][nx]=0;
             }
        }   
            
            
        
    }
     
}