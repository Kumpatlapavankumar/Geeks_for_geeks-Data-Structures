
// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr=new int[n];
        arr[0]=0;
        if(n==1){
            return arr;
        }
        arr[1]=1;
        int count=3;
        while(count<=n){
            arr[count-1]=arr[count-2]+arr[count-3];
            count++;
        }
        return arr;
    }
}
