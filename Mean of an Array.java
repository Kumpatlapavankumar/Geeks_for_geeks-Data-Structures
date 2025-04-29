
// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
         int sum=0;
        int n=arr.length;
      for(int i=0; i<n;i++){
          sum+=arr[i];
      }
      return sum/n;
    }
};
