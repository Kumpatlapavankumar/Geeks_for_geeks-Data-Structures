class Solution {

    void printTriangle(int n) {
        // code here
        int st = 1;
        for (int line = 1; line <= 2 * n - 1; line++) {
            // Print stars
            for (int star = 1; star <= st; star++) {
                System.out.print("*"+" ");
            }

            if (n > line) {
                st++;
            } else {
                st--;
            }
            System.out.println("");
        }
    }
}
