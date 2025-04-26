class Solution {
    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        // code here
        int [][]c = new int[A.length][B[0].length];
         if(A[0].length == B.length){
        for (int i=0;i<A.length;i++){
            for (int j=0;j<B[0].length;j++){
                for(int k=0;k<B.length;k++){
                    c[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        }
           else{
            c = new int [1][1];
            c[0][0] = -1;
        }
        return c;
        
    }
}
