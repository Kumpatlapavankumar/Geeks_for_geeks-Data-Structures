
//User function Template for Java

class Solution
{
    static int fibonacci(int n)
    {
        // your code here
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}


