class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return new Pair<>((long) min, (long) max);
    }
}
