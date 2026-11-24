class NumMatrix {
    private int[][] prefixMat;
    
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        this.prefixMat = new int[rows+1][columns+1];
        for(int i = 0 ; i < rows ; i++) {
            int prefix = 0;
            for(int j = 0 ; j < columns ; j++) {
                prefix += matrix[i][j];
                int above = this.prefixMat[i][j+1];
                this.prefixMat[i+1][j+1] = above + prefix;
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int bottomRight = this.prefixMat[row2+1][col2+1];
        int above = this.prefixMat[row1][col2+1];
        int left = this.prefixMat[row2+1][col1];
        int topLeft = this.prefixMat[row1][col1];
        return bottomRight - above - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */