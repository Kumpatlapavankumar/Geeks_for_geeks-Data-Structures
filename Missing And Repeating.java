// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
          int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int nsum = n * (n + 1) / 2; // Sum of first n natural numbers

        // Logic to find the duplicate element
        for (int i = 0; i < n; i++) {
            if (st.contains(arr[i])) {
                res.add(arr[i]); // Found the duplicate
            } else {
                st.push(arr[i]);
            }
        }

        // Correct stack usage
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        // Calculate the missing number
        int missingNum = nsum - sum;
        res.add(missingNum);

        return res;
    }
}
