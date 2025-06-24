class Solution {
    public int countDigits(int n) {
        // code here
          int count = 0;

        if (n < 0) n = -n;  // Optional: handle negatives
    
        do {
            n = n / 10;
            count++;
        } while(n != 0);  // Loop always runs at least once
    
        return count;
    }
}
