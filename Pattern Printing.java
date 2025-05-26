// User function Template for Java
class Solution {
    static void printPattern(int N) {
        // code here
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                result.append("*"); // Append stars with spaces
            }
            result.append(" "); // Add extra space between rows
        }
        
        System.out.print(result.toString().trim());
    }
}
