// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int row = Mat.length;
        int col = Mat[0].length;
        int []ans = new int[row*col];
        int index = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[index] = Mat[i][j];
                index++;
            }
        }
        Arrays.sort(ans);
        index = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Mat[i][j] = ans[index];
                index++;
            }
        }
        return Mat;
    }
};
