//User function Template for Java

class Solution {
    static int countSquares(int N) {
        // code here
        int count=0;
        for(int i=1;i*i<N;i++){
            count++;
        }
        return count;
    }
}
