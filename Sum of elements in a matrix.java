
// User function Template for Java

class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum=0;
        
        for(int i=0;i<=N-1;i++){
            for(int j=0;j<=M-1;j++){
                sum = sum + Grid[i][j];
            }
        }
        return sum;
    }
}
