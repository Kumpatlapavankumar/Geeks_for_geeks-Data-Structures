
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
        int x = a2-a1;
        int ans = a1;
        ans+= (n-1)*x;
        return ans;
    }
}
        
