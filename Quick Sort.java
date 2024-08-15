
class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot=arr[high];
        int k=low-1;
        for(int i=low;i<=high-1;i++){
            if(arr[i]<pivot){
                k++;
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[k+1];
        arr[k+1]=arr[high];
        arr[high]=temp;
        return k+1;
    } 
}
