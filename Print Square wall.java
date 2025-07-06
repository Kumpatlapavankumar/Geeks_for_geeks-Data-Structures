// User function Template for Java
class Solution {
    public static void squareWall(int s) {
        // Write your code here
        for(int i = 0; i < s; i++) {
            for(int j = 0; j < s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
