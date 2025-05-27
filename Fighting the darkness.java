class Solution {
    long maxDays(int arr[]) {
        // code here
         long max=0;
        
        for(int v:arr){
            if(max<v){
                max=(long)v;
            }
        }
        return max;
    }
}
