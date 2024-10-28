
class Solution {
    public static int[] binSort(int n, int[] arr) {
        // code here
        int low=0;
        int high=n-1;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                temp[low]=arr[i];
                low++;
            }else{
                temp[high]=arr[i];
                high--;
            }
        }
        return temp;
    }
}
