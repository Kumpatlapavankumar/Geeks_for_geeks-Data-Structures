class Solution {
    public void rotate(int[] arr) {
        // code here
        if (arr.length== 0) return;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, 0);
        reverse(arr, 1, arr.length - 1);
    }
    public void reverse(int[] arr,int low,int high){
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
