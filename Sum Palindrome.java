
// User function Template for Java
class Solution {
    static int isSumPalindrome(int n) {
        // code here
         if(n==toReverse(n)){
            return n;
        }
        int sum=0;
        int i=0;
        while(i<5){
            sum=n+toReverse(n);
            if(sum==toReverse(sum)){
                break;
            }
            n=sum;
            i++;
        }
        if(sum==toReverse(sum)){
            return sum;
        }
        else{
            return -1;
        }
    }
     static int toReverse(int n){
        int last=0; int rev=0;
        while(n!=0){
        last=n%10;
        rev=(rev*10)+last;
        n=n/10;
        }
        return rev;
    }
}
