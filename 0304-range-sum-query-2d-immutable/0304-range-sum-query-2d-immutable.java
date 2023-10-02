class NumMatrix {
    public int[][] prefixMatrix;
    public NumMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        prefixMatrix=new int[m+2][n+2];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                prefixMatrix[i+1][j+1]=matrix[i][j];
            }
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n+1;j++){
                prefixMatrix[i+1][j]+=prefixMatrix[i][j];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m+1;j++){
                prefixMatrix[j][i+1]+=prefixMatrix[j][i];
            }
        }
        // for(int []p:prefixMatrix){
        //     for(int i:p){
        //         System.out.print(" "+i);
        //     }
        //     System.out.println(" ");
        // }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        return prefixMatrix[row2+1][col2+1]-prefixMatrix[row2+1][col1]-prefixMatrix[row1][col2+1]+prefixMatrix[row1][col1];    
        
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */