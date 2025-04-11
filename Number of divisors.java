
// User function Template for Java
class Solution {
    static int countDivisors(int N) {
        // code here
         int count = 0;
        for (int i = 1; i * i <= N; i++) { // Check up to sqrt(N)
            if (N % i == 0) {
                // Check if divisors are divisible by 3
                if (i % 3 == 0) count++; // Divisor 1
                if (i != N / i && (N / i) % 3 == 0) count++; // Divisor 2
            }
        }
        return count;
    }
}
