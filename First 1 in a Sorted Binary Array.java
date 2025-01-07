
class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                return (long)i;
            }
        }
        return (long)-1;
    }
}
