//User function Template for Java

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int sum=0;
        int min=A[0];
        int max=A[0];
        
        for (int i=0; i<N; i++)
        {
            if (max<=A[i])
            max=A[i];
            if (min>=A[i])
            min=A[i];
        }
        
        sum=max+min;
        return sum;
    }
}
