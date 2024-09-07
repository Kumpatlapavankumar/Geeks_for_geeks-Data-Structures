
class Solution {
//donot edit this code 
    static int search(int arr[], int x) {

        // Your code here
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
