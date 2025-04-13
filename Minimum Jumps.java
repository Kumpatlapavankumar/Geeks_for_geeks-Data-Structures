
class Solution {
    static int minJumps(int[] arr) {
        // code here
         int jumps = 0;
        int curr_limit = 0;
        int max_limit = 0;
        for(int i = 0; i < arr.length-1 && i <= curr_limit; i++) {
            max_limit = Math.max(max_limit , arr[i] + i);
            if(i >= curr_limit) {
                jumps++;
                curr_limit = max_limit;
            }
        }
        return curr_limit >= arr.length-1  ? jumps : -1;
    }
}
