class Solution {

    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int n=arr.length;
        int m=target;
        boolean[][] dp=new boolean[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<=m;j++){
            dp[0][j]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][m];
    }
}
