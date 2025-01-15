//User function Template for Java

class Complete{
    
   //donot edit this code
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0; i<n-1; i++) {
            arr[i] = arr[i] ^ arr[i+1];
        }
        return arr;
    }
}



