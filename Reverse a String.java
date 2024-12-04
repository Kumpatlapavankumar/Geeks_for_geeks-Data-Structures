class Solution {
    static String revStr(String s) {
        // code here
        int low=0;
        int high=s.length()-1;
        char[] arr=s.toCharArray();
        while(low<high){
            char tem=arr[low];
            arr[low]=arr[high];
            arr[high]=tem;
            low++;
            high--;
        }
        return new String(arr);
    }
}
