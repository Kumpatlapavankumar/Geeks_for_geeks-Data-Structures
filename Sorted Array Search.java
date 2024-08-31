
class Solution{
    static int searchInSorted(int arr[], int N, int x)
    {
        
        int low=0;
        int high=N-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return 1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
