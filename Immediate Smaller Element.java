//User function Template for Java
class Solution {
    void immediateSmaller(int arr[], int n) {
        // Check if the array has at least two elements
        if (n <=0) {
            return;
        }
        // Iterate through the array to find immediate smaller elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i]=arr[i+1];
            } else {
                arr[i]=-1;
            }
        }
        
        // Print -1 for the last element
        arr[n-1]=-1;
    }
}
