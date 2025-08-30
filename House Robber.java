//User function Template for Java
//donot edit this code
class Solution {
    static int maximizeMoney(int N , int K) {
        // code here
        int sum=0;
        for(int i=1;i<=N;i=i+2){
          sum=sum+K;  
        }
        return sum;
    }
};
