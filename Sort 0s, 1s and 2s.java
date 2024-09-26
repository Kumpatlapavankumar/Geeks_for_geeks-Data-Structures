
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                int temp=arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }else{
                int temp=arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);
                high--;
            }
        }
    }
}
