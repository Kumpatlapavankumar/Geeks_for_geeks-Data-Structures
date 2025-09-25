class Solution {
    //donot edit this code
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) <= x) {
                count++;
            }
        }
        return count;
    }
}
