class Solution {
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(int arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        
        //create prefix sum
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        int store = -1;
        for(int i=1; i<prefix.length-1; i++){
            int left = prefix[i-1];
            int right = prefix[n-1] - prefix[i];
            if(left == right){
                store = i+1;
                break;
            }
            
        }
        
        return store;
    }
}
