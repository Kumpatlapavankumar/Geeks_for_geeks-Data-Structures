class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        int n=arr1.length;
        int m=arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int low=0;
        int high=0;
        while(low<n && high<m){
            if(arr1[low]!=arr2[high]){
                return false;
            }
            low++;
            high++;
        }
        return true;
    }
}
