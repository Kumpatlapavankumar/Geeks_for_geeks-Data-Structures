// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        // code here
        int n=arr.length;
        int ls=0;
        int rs=0;
        for(int i=0;i<=(n/2)-1;i++){
            ls=ls+arr[i];
        }
        for(int i=n-1;i>=(n/2);i--){
            rs=rs+arr[i];
        }
        return ls*rs;
    }
}
