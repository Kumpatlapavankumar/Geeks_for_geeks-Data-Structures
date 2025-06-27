class Solution {
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
         if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
