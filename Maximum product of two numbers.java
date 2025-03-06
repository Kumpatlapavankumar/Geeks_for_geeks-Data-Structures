class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int maxgap=0;
        for(int i=1;i<arr.length;i++){
            int gap=arr[i]*arr[i-1];
            if(gap>maxgap){
                maxgap=gap;
            }
        }
        return maxgap;
    }
}
