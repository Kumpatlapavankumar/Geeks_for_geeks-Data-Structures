class GfG {
    // Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x) {
        if (x.isEmpty()) return 0;
        if (s.isEmpty() || s.length() < x.length()) return -1;

        for (int i = 0; i <= s.length() - x.length(); i++) {
            int j;
            for (j = 0; j < x.length(); j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break; // Mismatch found
                }
            }
            if (j == x.length()) {
                return i; // Match found, return starting index
            }
        }
        return -1; // No match found
    }
}
