// User function Template for Java

class Solution {
    public int minimumDifference(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            result.add(arr[i+1]-arr[i]);
        }
        return Collections.min(result);
    }
}
