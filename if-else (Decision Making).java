class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        }else if(n==m){
            return "equal";
        }else{
            return "greater";
        }
    }
}
