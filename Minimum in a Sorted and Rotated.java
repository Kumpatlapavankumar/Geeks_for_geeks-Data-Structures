
class Solution
{
    int findMin(int arr[])
    {
        //complete the function here
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                reverse(arr,0,i);
                reverse(arr,i+1,n-1);
                reverse(arr,0,n-1);
            }
        }
        return arr[0];
    }
    public static void reverse(int[] arr,int low,int high){
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
