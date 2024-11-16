class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(a==b){
            return a;
        }else if(a==0){
            return b;
        }else if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
        
