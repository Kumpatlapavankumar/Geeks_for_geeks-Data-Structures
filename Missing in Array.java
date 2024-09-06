class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<=n;i++){
            if(set.contains(i)==false){
                return i;
            }
        }
        return -1;
    }
}
