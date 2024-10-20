
class Solution{
    static long factorial(int N){
        // code here
        long fact=1;
        for(int i=1;i<=N;i++){
            fact=fact*i;
        }
        return fact;
    }
}
