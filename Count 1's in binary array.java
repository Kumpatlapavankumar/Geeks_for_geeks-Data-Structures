class Solution {
    public int countOnes(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        int num=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                num=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return num+1;
    }
}
