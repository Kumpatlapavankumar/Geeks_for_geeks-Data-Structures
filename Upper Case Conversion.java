// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        StringBuffer str = new StringBuffer();
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (check) {
                    str.append((char)(s.charAt(i) - 32));
                    check = false;
                } else
                    str.append(s.charAt(i));
            } else if (s.charAt(i) == ' ') {
                str.append(s.charAt(i));
                check = true;
            }
        }
        return str.toString();
    }
}
