class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        if(arr1.length==0&&arr2.length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        
        if(arr1.length==0){
            max=0;
        }
        int min=Integer.MAX_VALUE;
        if(arr2.length==0){
            min=0;
        }
        
        for(int v:arr1){
            if(max<v){
                max=v;
            }
        }
        for(int v:arr2){
            if(min>v){
                min=v;
            }
        }
        return min*max;
    }
}
