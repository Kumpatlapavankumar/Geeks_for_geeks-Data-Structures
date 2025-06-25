// User function Template for Java
class Solution {
    // function should find if the string p is
    // in the string s. Return the starting index
    // of the string p in s. Return -1 if the
    // string doesnot exists in s.
    public static int findPattern(String s, String p) {
        // code here
        if(s.contains(p)){
            String subst = new String(p);
            int a = s.indexOf(subst);
            return a;
        }
        return -1;
    }
}
