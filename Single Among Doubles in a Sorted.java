 class Solution {
    int findOnce(int[] arr) {
        // Complete this function
 int ans = 0;
        for (int a: arr) {
            ans ^= a;
        }
        return ans;
    }
}
