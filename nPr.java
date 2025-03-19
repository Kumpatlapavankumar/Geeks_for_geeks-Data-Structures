//User function Template for Java

class Solution{
    static long nPr(long n, long r){
        // code here
         long ans = fact(n)/fact(n-r);
         return ans;
    }
     static long fact (long x){
        if(x==0){
            return 1;
        }
        else{
            return (long)(x * fact(x-1));
        }
    }
}
