//User function Template for Java
class Solution {
    static long nthPosition(long n){
        // code here
         int position = 1;
        while (position * 2 <= n){
            position *= 2;
        }
        return position;
    }
    
}
