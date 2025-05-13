class Solution {
    static int setKthBit(int n, int k) {
        // code here
        return (n | (1 << k));

    }
}
