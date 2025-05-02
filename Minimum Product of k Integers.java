
class Solution {

    int minProduct(int arr[], int k) {
        // Complete the function
           // Sort the array to get the smallest k elements
        Arrays.sort(arr);

        // Define the large modulus value (1e9 + 7)
        long n = (long) 1e9;
        n = n + 7l;

        // Initialize the answer as 1 for the product calculation
        long ans = 1l;

        // Loop through the array to find the product of the first k elements
        for (int i = 0; i < arr.length && i < k; i++) {
            // Calculate the product and apply the modulus to prevent overflow
            ans = (long) ans * (long) arr[i];
            ans = (long) ans % (long) n;
        }

        // Return the result, ensuring it's within the modulus
        long a = (long) ans % (long) n;
        return (int) a;
    }
}
