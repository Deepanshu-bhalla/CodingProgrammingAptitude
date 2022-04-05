class matrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        if(size%2==0){
            int s1 = 0;
            for(int i=0;i<size;i++){
                s1 += mat[i][i];
            }
            int s2 = 0;
            for(int i=size-1;i>=0;i--){
                s2 += mat[size-1-i][i];
            }
            return s1+s2;
        }
        else{
            int sum = 0;
            int s = 0;
            int e = mat.length;
            int m = s + (e-s)/2;
            int sum1 =0,sum2 = 0;
            for(int i=0;i<size;i++){
                sum1 += mat[i][i];
            }
            for(int i=size-1;i>=0;i--){
                sum2 += mat[size-1-i][i];
            }
            
            return sum1 + sum2 - mat[m][m];
        }
    }
}
