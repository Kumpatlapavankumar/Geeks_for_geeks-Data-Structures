//User function Template for Java

class Solution
{
    long solve(int n, long A[], long b)
    {
        // Complete this function
         long sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(A[i]==b)
            {
                sum = b*2;
                b = sum;
            }

        }
        if(sum==0)
        {
            return b;
        }
        return sum;
    }
}
