class Solution {
    static String decToBinary(int n) {
        // code here
        if(n==0) return "0";
        if(n==1) return "1";
        return decToBinary(n/2) + n%2;
    }
}
