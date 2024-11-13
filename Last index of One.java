class Solution {
    public int lastIndex(String s) {
        // Start by initializing index to -1, which means no '1' found initially
        int index = -1;
        
        // Iterate through the string from the end to the start
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                index = i; // Update index when '1' is found
                break; // Exit the loop as soon as we find the last '1'
            }
        }
        
        return index; // Return the index or -1 if no '1' was found
    }
}
