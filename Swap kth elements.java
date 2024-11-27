
class Solution {
    public void swapKth(int k, List<Integer> arr) {
        // code here
        int temp = arr.get(k - 1);
        int t = arr.get(arr.size() - k);
        arr.set(k - 1,t);
        arr.set(arr.size() - k, temp);
    }
}
