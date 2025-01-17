// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
        int a=~n;
        a=a&a-1;
        return ~a;
    }
    
}
