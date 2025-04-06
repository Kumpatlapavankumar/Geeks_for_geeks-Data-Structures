// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
         StringBuilder sb = new StringBuilder(S1+S2);
        return sb.reverse().toString();
    }
}
