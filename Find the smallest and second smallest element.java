
// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
         if(arr.length<2){
            return new int[]{-1};
        }
        Arrays.sort(arr);
        int firstmin=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=firstmin){
                return new int[]{firstmin,arr[i]};
            }
        }
        return new int[]{-1};
    }
}
