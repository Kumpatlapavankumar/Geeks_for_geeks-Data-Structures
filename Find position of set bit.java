// User function Template for Java

class Solution {
    static int findPosition(int n) {
        // code here
        int num2= n-1;
        int KernighanLaw = n & (n-1);
        
        if(n==0) return -1;
        if(KernighanLaw==0){
            int position= (int)(Math.log10(n)/ Math.log10(2)+1);
            return position;
        }
        else{
             return -1;
        }
    }
};
