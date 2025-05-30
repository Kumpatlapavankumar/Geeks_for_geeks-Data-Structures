
class Solution {
    // Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int a, int b, int c) {
        // Your code here
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=-1;
            if(i-a>=0){
                dp[i]=Math.max(dp[i],dp[i-a]);
            }
            if(i-b>=0){
                dp[i]=Math.max(dp[i],dp[i-b]);
            }
            if(i-c>=0){
                dp[i]=Math.max(dp[i],dp[i-c]);
            }
            if(dp[i]!=-1){
                dp[i]++;
            }
        }
        if(dp[n]==-1){
            return 0;
        }
        return dp[n];
    }
}
