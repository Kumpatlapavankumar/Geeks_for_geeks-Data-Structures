
//User function Template for Java

class Solution
{
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p==0) return 1;
        int c = RecursivePower(n,p-1);
        return c = n*c;
    }
 
}
