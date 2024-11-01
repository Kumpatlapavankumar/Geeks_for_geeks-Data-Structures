
class Solution {
    void leftRotate(int arr[], int d) {
        int n=arr.length;
        // code here
        d=d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    void rotate(int[] arr,int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
